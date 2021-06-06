<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="n" uri="http://tis.co.jp/nablarch" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <title>ユーザ登録完了画面</title>
    </head>
    <body>
        <h2>ユーザ登録完了</h2>
        <c:if test="${user != null}">
            <table class="table">
                <th>
                    ユーザID
                </th>
                <td>
                    <n:write name="user.userId" />
                </td>
                <th>
                    氏名
                </th>
                <td>
                    <n:write name="user.kanjiName" />
                </td>
            </table>
        </c:if>
    </body>
</html>