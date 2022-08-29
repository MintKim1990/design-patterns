package structural_patterns.decorator.after;



public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    /**
     *
     * 데코레이터 패턴
     *
     * DeaultCommentService 클래스는 기본적으로 코멘트를 출력하는 Service인데
     * Decorator는 CommentService를 주입받아 코멘트를 넘기기전에 코멘트에 내용에 데코레이션을 하는 클래스이다.
     *
     * SpamFilteringCommentDecorator는 코멘트를 출력하기전에 주소링크를 제거하며
     * TrimmingCommentDecorator는 코멘트를 출력하기전에 ...을 제거한다.
     *
     * Client는 CommentService 클래스를 이용하여 코멘트를 출력하는 메소드만 호출하지만
     * Decorator가 타겟클래스를 호출하기전 ...을 제거하고 링크를 제거하는 작업을 진행하는데
     * Client에 CommentService 에 유기적으로 변경하고싶은 데코레이터 클래스를 넘기면
     * 코멘트를 출력할때 원하는 코멘트 데코레이션을 유기적으로 수행할 수 있다.
     *
     * 장점
     * 1. 새로운 클래스를 만들지 않고 기존 기능을 조합할 수 있다. (데코레이터가 타겟클래스를 감싸서 코멘트 데코레이션을 한 후 타겟클래스에 코멘트를 출력하기때문)
     * 2. 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다.
     *
     * 단점
     * 1. 데코레이터를 조합하는 코드가 복잡할 수 있다.
     */

    public static void main(String[] args) {

        CommentService commentService = new DefaultCommentService();

        if(enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if(enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

}
