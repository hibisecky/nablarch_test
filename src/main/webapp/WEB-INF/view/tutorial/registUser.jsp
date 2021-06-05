<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="n" uri="http://tis.co.jp/nablarch" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        <title>ユーザ登録</title>
    </head>
    <body>
        <h2>ユーザ登録</h2>
        <n:form method="POST">
            <table class="table">
                <tbody>
                    <th>
                        ユーザID
                    </th>
                    <td>
                        <div class="form-group">
                            <n:text name="userForm.userId" cssClass="form-control width-300" />
                        </div>
                    </td>
                    <th>
                        氏名(漢字)
                    </th>
                    <td>
                        <div class="form-group">
                            <n:text name="userForm.kanjiName" cssClass="form-control width-300" />
                        </div>
                    </td>
                    <th>
                        かな
                    </th>
                    <td>
                        <div class="form-group">
                            <n:text name="userForm.kanaName" cssClass="form-control width-300" />
                        </div>
                    </td>
                    <n:button uri="/action/tutorial/registUserConfirm">登録</n:button>
                </tbody>
            </table>
        </n:form>
    </body>
</html>