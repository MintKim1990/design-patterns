package creational_patterns.singleton;

import java.util.Objects;

public class Settings1 {

    private static Settings1 instance;

    private Settings1() {}

    /**
     * Thread-safe 하지만 동기화 로직으로 인해 성능에 불이익이 생길수있다.
     * @return
     */
    public static synchronized Settings1 getInstance() {

        if (Objects.isNull(instance)) {
            instance = new Settings1();
        }

        return instance;
    }

}
