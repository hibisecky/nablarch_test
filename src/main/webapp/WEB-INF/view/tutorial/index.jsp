<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="n" uri="http://tis.co.jp/nablarch" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <title>チュートリアル</title>
    </head>

    <body>
        <n:form method="POST">
            <h2>チュートリアル</h2>
            <div>
                <label for="loginId">ログインID</label>
                <n:text id="loginId" name="loginId" />
                <n:button uri="/action/tutorial/login">ログイン</n:button>
            </div>
        </n:form>
    </body>
</html>