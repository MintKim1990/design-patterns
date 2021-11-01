package creational_patterns.factorymethod.before;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("whiteship", "rlaalsxo1990@naver.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackship = ShipFactory.orderShip("blackship", "rlaalsxo1990@naver.com");
        System.out.println("blackship = " + blackship);

    }

}
