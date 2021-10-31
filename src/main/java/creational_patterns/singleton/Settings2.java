package creational_patterns.singleton;

public class Settings2 {

    /**
     * Thread-safe 하지만 미리 로딩시점에 객체를 생성하여 지연생성이 불가능하다.
     * 또한 해당객체가 많은 리소스를 잡아먹는다는 가정하에 호출이되지않는다면 자원낭비가 될 가능성도 있다.
     */
    private static final Settings2 INSTANCE = new Settings2();

    private Settings2() {}

    public static Settings2 getInstance() {
        return INSTANCE;
    }

}
