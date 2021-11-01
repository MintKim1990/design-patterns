package creational_patterns.factorymethod.after;

import org.springframework.util.StringUtils;

public interface ShipFactory {

    /**
     * private 메소드는 Java9 부터 지원
     * default 메소드는 java8 부터 지원
     */

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip();

    void validate(String name, String email);

    void prepareFor(String name);

    void sendEmailTo(String email, Ship ship);

}
