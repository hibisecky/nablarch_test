package com.nablarch.example.app.web.action;

import com.nablarch.example.app.entity.SystemAccount;
import com.nablarch.example.app.entity.Users;
import com.nablarch.example.app.web.common.authentication.context.LoginUserPrincipal;
import com.nablarch.example.app.web.dto.UsersDto;
import com.nablarch.example.app.web.form.LoginForm;
import com.nablarch.example.app.web.form.UserForm;
import nablarch.common.dao.UniversalDao;
import nablarch.common.web.session.SessionUtil;
import nablarch.core.beans.BeanUtil;
import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;

import java.util.List;

/**
 * チュートリアル。
 *
 * @author Sekine Hibiki
 */
public class TutorialAction {

    /**
     * チュートリアルログイン画面を表示。
     *
     * @param request HTTPリクエスト
     * @param context 実行コンテキスト
     * @return HTTPレスポンス
     */
    public HttpResponse index(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/index.jsp");
    }

    /**
     * ログインする。
     *
     * @param request HTTPリクエスト
     * @param context 実行コンテキスト
     * @return HTTPレスポンス
     */
    public HttpResponse login(HttpRequest request, ExecutionContext context){
        LoginForm form = BeanUtil.createAndCopy(LoginForm.class, request.getParamMap());
        form.setLoginId("10000001");
        form.setUserPassword("pass123-");

        SessionUtil.invalidate(context);
        LoginUserPrincipal userContext = createLoginUserContext(form.getLoginId());
        SessionUtil.put(context, "userContext", userContext);
        SessionUtil.put(context, "user.id", String.valueOf(userContext.getUserId()));
        //context.setRequestScopedVar("form", form);
        SessionUtil.put(context, "form", form);
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

    public HttpResponse detail(HttpRequest request, ExecutionContext context){
        LoginForm form = SessionUtil.get(context, "form");
        SystemAccount account = UniversalDao.findBySqlFile(SystemAccount.class,
                        "FIND_SYSTEM_ACCOUNT_BY_AK", new Object[]{form.getLoginId()});
        Users users = UniversalDao.findById(Users.class, account.getUserId());
        context.setRequestScopedVar("users", users);
        account.setUsers(users);
        context.setRequestScopedVar("account", account);
//        context.setRequestScopedVar("loginId", form.getLoginId());
        return new HttpResponse("/WEB-INF/view/tutorial/detail.jsp");
    }

    public HttpResponse searchUsers(HttpRequest request, ExecutionContext context){
        List<Users> users = UniversalDao.findAll(Users.class);
        context.setRequestScopedVar("users", users);
        return new HttpResponse("/WEB-INF/view/tutorial/searchUsers.jsp");
    }

    public HttpResponse newEntity(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/registUser.jsp");
    }

    public HttpResponse registUser(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/registUser.jsp");
    }

    public HttpResponse confirmOfRegistUser(HttpRequest request, ExecutionContext context){
        UserForm userForm = context.getRequestScopedVar("userForm");
        UsersDto user = BeanUtil.createAndCopy(UsersDto.class, userForm);
        SessionUtil.put(context, "user", user);
        return new HttpResponse("/WEB-INF/view/tutorial/confirmOfRegistUser.jsp");
    }

    /**
     * ユーザ登録完了画面を表示。
     *
     * @param request HTTPリクエスト
     * @param context 実行コンテキスト
     * @return HTTPレスポンス
     */
    public HttpResponse completeOfRegistUser(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/completeOfRegistUser.jsp");
    }

    public HttpResponse edit(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/update.jsp");
    }

    public HttpResponse update(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/confirmOfUpdate.jsp");
    }

    public HttpResponse delete(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/confirmOfDelete.jsp");
    }

    //test
    
    //test2

    //test3
}
