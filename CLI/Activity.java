package CLI;

import java.io.*;

public class Activity {
    private static String filePath;

    public static void main(String[] args) throws IOException {
        // Default port
        int port = 8999;

        if (args.length < 2) {
            System.out.println("File path and port are required.");
            System.exit(1);
        }

        // Get file path from args
        filePath = args[0];

        // Get port from args
        try {
            port = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.err.println("Argument" + args[1] + " must be an integer.");
            System.exit(1);
        }

        new Activity().onCreate();

    }

    public Activity() {
    }

    public void onCreate() {
        System.out.println(new CLI.UploadClient().uploadFile(filePath));
    }
}
