<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="n" uri="http://tis.co.jp/nablarch" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <title>メニュー</title>
    </head>

    <body>
        <h2>メニュー</h2>
        <table class="table">
            <tbody>
                <tr>
                    <th>ユーザID</th>
                    <td><n:write name="form.loginId"/></td>
                </tr>
            </tbody>
            <n:a href="/action/tutorial/detail">プロフィール</n:a><br>
            <n:a href="/action/tutorial/searchUsers">ユーザ検索</n:a><br>
            <n:a href="/action/tutorial/registUser">ユーザ登録</n:a>
        </table>
    </body>
</html>