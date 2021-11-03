package creational_patterns.factorymethod.after;

import creational_patterns.abstractfactory.after.WhitePartsProFactory;
import org.springframework.util.StringUtils;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }

}
