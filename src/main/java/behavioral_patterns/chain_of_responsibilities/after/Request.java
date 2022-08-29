package behavioral_patterns.chain_of_responsibilities.after;

public class Request {

    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
