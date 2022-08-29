package behavioral_patterns.strategy.after;

public class Client {

    /**
     * BlueLightRedLight 클래스에 전략을 구성해놓고
     * 각각의 전략을 수행할 클래스를 인터페이스 기반 파라미터로 주입받아서 전략을 수행하는 패턴
     *
     * 전략을 수행할 클래스를 매번 변경하여 수행이 가능하여 유동적이다는 장점이 존재재
    * @param args
     */

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
    }

}
