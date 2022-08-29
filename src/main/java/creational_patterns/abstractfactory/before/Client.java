package creational_patterns.abstractfactory.before;

import creational_patterns.factorymethod.after.BlackshipFactory;
import creational_patterns.factorymethod.after.WhiteshipFactory;

public class Client {

    public static void main(String[] args) {

        /**
         * Blackship 이 추가되었으나 Whiteship 만드는 로직은 전혀 변경된게 없고
         * BlackShip 을 만드는 클래스만 추가되었다.
         *
         * 확장에는 열려있고 변경에는 닫혀있다.
         *
         * 팩토리메소드패턴은 분기해야하는 클라이언트 로직을 제외한 나머지는 인터페이스 다형성 기반에 코딩으로
         * 다형성이 적용된 로직은 다른 클래스가 추가되어도 기존 클래스는 변경되지않는 부분을 강조하는 패턴으로 이해된다.
         */

        Client client = new Client();

        client.print(new whiteshipFactory(), "Whiteship", "rlaalsxo1990@naver.com");

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        shipFactory.orderShip(name, email);
    }

}

