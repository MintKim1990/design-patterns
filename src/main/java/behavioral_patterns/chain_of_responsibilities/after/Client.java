package behavioral_patterns.chain_of_responsibilities.after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    /**
     * RequestHandler 라는 추상클래스를 기반으로 인증, 로깅, 출력등에 작업을 하는 RequestHandler들을 만들고
     * 체이닝하여 각자의 역활을 수행하는 패턴을 책임연쇄패턴이라한다.
     *
     * 클라이언트는 체이닝이 어떻게 구성되었는지 알필요없이 doWork 메소드를 호출하기만하면 체이닝방식으로 동작하게되므로
     * 클라이언트 코드는 변경되지 않는다.
     *
     * 장점
     * 1. 클라이언트 코드를 변경하지않고 RequestHandler를 추가하여 확장가능하다.
     *
     * 단점
     * 1. 디버깅이 어렵다?
     *
     */
    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

        Client client = new Client(chain);
        client.doWork();
    }
}
