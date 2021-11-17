package behavioral_patterns.visitor.after;

public class Client {

    /**
     * 디스패치란 사용하려는 객체 인스턴스가 정적이지 않고 동적일경우 런타임시점에 해당 객체를 사용할때 구체클래스를 추론하는 과정
     *
     * Java 언어에서는 디스패치를 한번만 지원한다.
     * 이유는 다양하겠지만 동적인 인스턴스에 구체클래스를 추론하는 과정또한 로직이기때문에
     * 디스패치를 여러번 지원한다면 그만큼 여러번에 추론로직이 필요하여 느려질수있어서 한번만 지원하는것으로 판단
     *
     * before 패키지에 Client 코드를 보면 rectangle 인스턴스는 인터페이스 타입으로 해당 인스턴스에 printTo 메소드를 호출할때
     * 구현클래스들중 어떤 구현클래스에 printTo 메소드를 호출해야하는지 추론하는 과정이 1번 필요하다.     *
     * 그리고 printTo 메소드에 파라미터 device 인스턴스 또한 인터페이스 타입으로 printTo 메소드 파라미터로
     * 어떤 Device 인터페이스 구현체 클래스인지 추론하는 과정이 1번 필요하다.
     *
     * 즉 Shape 인터페이스에 printTo 메소드를 호출하려면 Shape 인터페이스에 구현클래스, Device 인터페이스에 구현클래스가 무엇인지 2번 추론을 해야 호출이 가능하다.
     *
     * Shape 디스패치 1번
     * Device 디스패치 1번
     *
     * 따라서 Java 문법에서는 더블 디스패치를 지원하지않기때문에 해당문법은 컴파일 에러가 발생한다.
     *
     * after 패키지에 Client 코드를 보면 rectangle 인스턴스는 인터페이스 타입으로 해당 인스턴스에 accept 메소드를 호출할때
     * 구현클래스들중 어떤 구현클래스에 accept 메소드를 호출해야하는지 추론하는 과정이 1번 필요하다.
     *
     * accept 메소드에서는 Device 인터페이스 타입에 print메소드를 호출하는데 파라미터로 자기자신을 넘기고있으며 이를 통해서 어떤 Device 인터페이스 타입에
     * 구현클래스에 print 메소드를 호출해야하는지 추론하는 과정이 1번 필요하다.
     *
     * 즉 after 패키지에 print 기능은 1번에 디스패치 과정이 accept 메소드로 책임이 넘어갔기때문에 구현클래스를 2번 추론하지않아도 호출이 가능함으로 컴파일 에러가 나지않고 동작한다.
     * 왜냐하면 rectangle.accept(device) 문법에서는 Shape 타입에 rectangle 인스턴스에 구현클래스가 무엇인지만 알고 호출하면 Device 타입에 구현클래스 추론은
     * accept 메소드에서 수행하기때문에 accept 메소드를 호출하는 시점에는 device 인스턴스에 구현클래스가 무엇인지 당장 알필요가 없으므로 디스패치가 2번
     * 일어나지 않는다.
     *
     * 해당 문법을 다이나믹 더블 디스패치라고도 하며 해당 Device가 얼만큼 늘어나든 Device 구현클래스만 구현하여 확장하면되며
     * 클라이언트 코드는 변함이 없다.
     *
     * 이러한 패턴을 Visitor 패턴이라한다.
     *
     * 장점
     * 1. 기존 코드를 변경하지않고 Device 구현클래스만 구현하면서 얼마든지 확장이 가능하다.
     *
     * 단점
     * 1. 구조가 복잡하기때문에 흐름을 파악하기 어렵다.
     */

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();

        rectangle.accept(device);
    }

}
