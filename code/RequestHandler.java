public interface RequestHandler<I, O> {
    public O handleRequest(I input, Context context);
}
