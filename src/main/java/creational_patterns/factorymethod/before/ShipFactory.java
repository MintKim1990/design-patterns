package creational_patterns.factorymethod.before;

import org.springframework.util.StringUtils;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {

        if(!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if(!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if(name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("whiteship");
            ship.setColor("white");
        } else {
            ship.setLogo("blackship");
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println("email = " + email);
        System.out.println(ship + " 이 만들어졌습니다.");
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만드는중..");
    }

}
