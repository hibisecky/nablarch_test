<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="n" uri="http://tis.co.jp/nablarch" %>
<%@ taglib prefix="app" tagdir="/WEB-INF/tags/listSearchResult" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <title>ユーザ検索</title>
    </head>

    <body>
        <h2>ユーザ検索</h2>
        <c:if test="${users != null}">
            <n:write value="テスト" />
            <app:listSearchResult
                resultSetName="users">
                <jsp:attribute name="headerRowFragment">
                    <tr>
                        <th>ユーザID</th>
                        <th>名前</th>
                    <tr>
                </jsp:attribute>
                <jsp:attribute name="bodyRowFragment">
                    <tr class="info">
                        <td>
                            <n:write name="row.userId" />
                        </td>
                        <td>
                            <n:write name="row.kanjiName" />
                        </td>
                    </tr>
                </jsp:attribute>
            </app:listSearchResult>
        </c:if>
    </body>
</html>