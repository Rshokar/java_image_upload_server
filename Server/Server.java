package Server;

import java.io.IOException;
import java.net.ServerSocket;

import Server.Router.Router;

public class Server {
    public static void main(String[] args) throws IOException {

        int port = 8999;

        // If port is specified, use it
        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("Could not listen on port: " + port);
            System.exit(-1);
        }
        System.out.println("Listening on port " + port);
        while (true) {
            new Router(serverSocket.accept()).start();
        }
    }
}
