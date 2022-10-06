package router;

import java.io.InputStream;

public class HttpRequest {
    private InputStream inputStream = null;

    public HttpRequest(InputStream inputStream) {
        System.out.println("HttpRequest");
        this.inputStream = inputStream;
    }

    public InputStream getInputStream() {
        return inputStream;
    }
}
