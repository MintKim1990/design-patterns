package structural_patterns.composite.after;

public class Client {

    /**
     *
     * Composite 패턴
     *
     * 아이템과 가방에서 가격을 책정하기위해 Client는 printPrice라는 메소드에 가방, 아이템의 가격을 각각 구현했지만
     * 가방과 아이템을 Component 인터페이스를 상속시켜 트리형태를 만들고 클라이언트의 printPrice 메소드는
     * Component에 가격을 조회하는 메소드만 호출하면 트리아래에 각 요소들이 자신의 가격을 리턴하는식으로 구현했다.
     *
     * 클라이언트는 printPrice로 넘어온 Component 객체가 최상단 객체인지 최하위 객체인지 알필요가 없으며
     * 넘어온 객체에 가격만 요청하여 넘겨받는다.
     *
     * 각 요소들에 공통처리사항을 Component 인터페이스를 상속시켜 트리구조를 만들고 책임을 위임하는 패턴
     *
     * 장점
     * 1. 복잡한 트리 구조를 편리하게 사용할 수 있다.
     * 2. 다형성과 재귀를 활용할 수 있다.
     * 3. 클라이언트 코드를 변경하지 않고 새로운 엘리멘트를 추가할 수 있다.
     *
     * 단점
     * 1. 공통된 처리사항을 인터페이스로 묶기때문에 지나치게 일반화 해야하는 경우가 생길 가능성이 높다.
     *
     */

    public static void main(String[] args) {

        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }



}
