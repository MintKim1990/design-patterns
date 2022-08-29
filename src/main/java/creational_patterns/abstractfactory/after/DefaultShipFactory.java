package creational_patterns.abstractfactory.after;

import org.springframework.util.StringUtils;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void validate(String name, String email) {
        if(!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if(!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만드는중..");
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println("email = " + email);
        System.out.println(ship + " 이 만들어졌습니다.");
    }

}
