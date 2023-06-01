package CLI;

import java.io.*;
import java.net.*;

public class UploadClient {
    public UploadClient() {
        System.out.println("UploadClient Constructor");
    }

    public String uploadFile(String filePath) {

        String listing = "";
        try {
            if (filePath == null || filePath.trim().equals("")) {
                throw new Exception("Invalid filename");
            }

            Socket socket = new Socket("localhost", 8999);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            OutputStream out = socket.getOutputStream();
            FileInputStream fis = new FileInputStream(filePath);
            byte[] bytes = fis.readAllBytes();
            out.write(bytes);
            socket.shutdownOutput();
            fis.close();
            socket.shutdownInput();
        } catch (Exception e) {
            System.err.println(e);
        }
        return listing;
    }
}