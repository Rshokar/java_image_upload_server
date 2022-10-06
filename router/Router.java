package router;

import java.io.InputStream;

import java.io.OutputStream;
import java.lang.Object;
import java.net.Socket;

import javax.swing.tree.ExpandVetoException;

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
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }

}