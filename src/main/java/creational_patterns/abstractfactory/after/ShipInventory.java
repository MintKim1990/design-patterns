package creational_patterns.abstractfactory.after;

public class ShipInventory {

    public static void main(String[] args) {

        /**
         * ShipFactory를 만드는 과정에서 생성자로  WhitePartsProFactory 클래스를 넘기기때문에 이는 추상화되어있지 않으며
         * 팩토리 메소드 패턴이다.
         *
         * 하지만 ShipFactory 입장에서는 생성자로 인터페이스 객체가 들어오기때문에
         * 클라이언트 코드 또한 추상화되어있다.
         *
         * 즉
         *
         * 추상팩토리 : 클라이언트 코드까지 추상화
         * 팩토리메소드 : 클라이언트 코드는 추상화되지 않음음
        */

        ShipFactory shipFactory = new WhiteshipFactory(
                new WhiteshipPartsFactory()
        );
        Ship ship = shipFactory.createShip();

        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());
    }

}
