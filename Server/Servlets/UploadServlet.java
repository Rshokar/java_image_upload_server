package Server.Servlets;

import java.io.*;
import java.time.Clock;

import Server.Router.HttpRequest;
import Server.Router.HttpResponse;

public class UploadServlet extends HttpServlet {
    public void doPost(HttpRequest request, HttpResponse response) {
        try {

            // Read InputStream from HttpRequest
            InputStream in = request.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] content = new byte[1];
            int bytesRead = -1;
            while ((bytesRead = in.read(content)) != -1) {
                baos.write(content, 0, bytesRead);
            }

            // Write to file
            Clock clock = Clock.systemDefaultZone();
            long milliSeconds = clock.millis();
            String fileName = String.valueOf(milliSeconds) + ".png";
            OutputStream outputStream = new FileOutputStream(new File(fileName));
            baos.writeTo(outputStream);
            outputStream.close();
            System.out.println("New File: " + fileName);
            System.out.println();

            // Send response / directory listing
            PrintWriter out = new PrintWriter(response.getOutputStream(), true);
            File dir = new File(".");
            String[] chld = dir.list();
            System.out.println("Directory Listing:");
            for (int i = 0; i < chld.length; i++) {
                String fN = chld[i];
                out.println(fN + "\n");
                System.out.println(fN);
            }

            out.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}