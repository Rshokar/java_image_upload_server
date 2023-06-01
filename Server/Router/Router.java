package Server.Router;

import java.net.Socket;

import Server.Servlets.HttpServlet;
import Server.Servlets.UploadServlet;

public class Router extends Thread {
    private Socket socket;

    public Router(Socket socket) {
        System.out.println("Router");
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            HttpRequest request = new HttpRequest(socket.getInputStream());
            HttpResponse response = new HttpResponse(socket.getOutputStream());

            HttpServlet servlet = new UploadServlet();

            servlet.doPost(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
