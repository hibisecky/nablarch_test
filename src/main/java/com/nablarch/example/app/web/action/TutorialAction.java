package com.nablarch.example.app.web.action;

import com.nablarch.example.app.entity.SystemAccount;
import com.nablarch.example.app.entity.Users;
import com.nablarch.example.app.web.common.authentication.context.LoginUserPrincipal;
import com.nablarch.example.app.web.form.LoginForm;
import nablarch.common.dao.UniversalDao;
import nablarch.common.web.session.SessionUtil;
import nablarch.core.beans.BeanUtil;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;


public class TutorialAction {
    public HttpResponse index(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/index.jsp");
    }

    public HttpResponse login(HttpRequest request, ExecutionContext context){
        LoginForm form = BeanUtil.createAndCopy(LoginForm.class, request.getParamMap());
        form.setLoginId("10000001");
        form.setUserPassword("pass123-");

        SessionUtil.invalidate(context);
        LoginUserPrincipal userContext = createLoginUserContext(form.getLoginId());
        SessionUtil.put(context, "userContext", userContext);
        SessionUtil.put(context, "user.id", String.valueOf(userContext.getUserId()));
        context.setRequestScopedVar("form", form);
        return new HttpResponse("/WEB-INF/view/tutorial/menu.jsp");
    }

    private LoginUserPrincipal createLoginUserContext(String loginId) {
        SystemAccount account = UniversalDao
                .findBySqlFile(SystemAccount.class,
                        "FIND_SYSTEM_ACCOUNT_BY_AK", new Object[]{loginId});
        Users users = UniversalDao.findById(Users.class, account.getUserId());

        LoginUserPrincipal userContext = new LoginUserPrincipal();
        userContext.setUserId(account.getUserId());
        userContext.setKanjiName(users.getKanjiName());
        userContext.setLastLoginDateTime(account.getLastLoginDateTime());

        return userContext;

    }
}
