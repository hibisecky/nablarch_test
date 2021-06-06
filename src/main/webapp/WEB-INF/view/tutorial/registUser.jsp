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
                </tbody>
            </table>
            <n:forInputPage>
                <n:button uri="/action/tutorial/confirmOfRegistUser">登録</n:button>
            </n:forInputPage>
            <n:forConfirmationPage>
                <n:button uri="/action/tutorial/completeOfRegistUser">確定</n:button>
            </n:forConfirmationPage>
            <section>
                <div class="page-footer">
                    <div class="button-nav">
                        <div class="button-block link-button-block">
                            <n:a href="/action/tutorial/login" cssClass="btn btn-raised btn-default">戻る</n:a>
                        </div>
                    </div>
                </div>
            </section>
        </n:form>
    </body>
</html>