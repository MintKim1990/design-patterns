package behavioral_patterns.chain_of_responsibilities.after;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증확인...");
        super.handle(request);
    }
}
