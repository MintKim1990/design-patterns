package creational_patterns.abstractfactory.after;

public class WhiteshipFactory extends DefaultShipFactory {

    /**
     * 추상팩토리 패턴 : 클라이언트까지 추상화한 개념
     */

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
