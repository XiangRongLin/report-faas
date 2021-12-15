public interface RequestStreamHandler {
    public void handleRequest(InputStream input,
        OutputStream output, Context context) throws IOException;
}