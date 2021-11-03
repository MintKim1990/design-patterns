package creational_patterns.abstractfactory.after;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WhitePartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
