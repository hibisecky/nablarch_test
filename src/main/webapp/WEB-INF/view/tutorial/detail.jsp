<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="n" uri="http://tis.co.jp/nablarch" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <title>プロフィール</title>
    </head>

    <body>
        <h2>プロフィール</h2>
        ユーザID：<n:write name="account.userId"/>
        ログインID：<n:write name="account.loginId"/>
        氏名：<n:write name="users.kanjiName" />
        氏名(アカウント)：<n:write name="account.users.kanjiName" />
        <n:include path="/WEB-INF/view/common/footer.jsp" />
        <section>
            <div class="page-footer">
                <div class="button-nav">
                    <div class="button-block link-button-block">
                        <n:a href="/action/tutorial/login" cssClass="btn btn-raised btn-default">戻る</n:a>
                    </div>
                </div>
            </div>
        </section>
        <n:script type="text/javascript">
            $(function(){
                setListUrlTo("topReturnList");
                setListUrlTo("bottomReturnList");
            });
        </n:script>
    </body>
</html>