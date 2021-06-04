package com.nablarch.example.app.web.action;

import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;


public class TutorialAction {
    public HttpResponse index(HttpRequest request, ExecutionContext context){
        return new HttpResponse("/WEB-INF/view/tutorial/index.jsp");
    }
}
