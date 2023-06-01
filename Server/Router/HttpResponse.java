package Server.Router;

import java.io.OutputStream;

public class HttpResponse {
    private OutputStream outputStream = null;

    public HttpResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }
}
