package behavioral_patterns.chain_of_responsibilities.before;

public class AuthReqeustHandler extends RequestHandler {

    @Override
    public void handler(Request request) {

        System.out.println("인증여부 확인..");

        super.handler(request);
    }
}
