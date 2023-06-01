package Server.Servlets;

import Server.Router.HttpRequest;
import Server.Router.HttpResponse;

public abstract class HttpServlet {
    protected void doGet(HttpRequest request, HttpResponse response) {
        return;
    };

    public void doPost(HttpRequest request, HttpResponse response) {
        return;
    };
}