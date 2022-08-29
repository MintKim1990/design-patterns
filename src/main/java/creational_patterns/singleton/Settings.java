package creational_patterns.singleton;

import java.io.Serializable;
import java.util.Objects;

public class Settings {

    /**
     * 항상 동일한 객체만 리턴하지만 멀티스레드 환경에서 Thread-safe 하지 않다는 단점이 존재
     */

    private static Settings instance;

    private Settings() {}

    public static Settings getInstance() {

        if (Objects.isNull(instance)) {
            instance = new Settings();
        }

        return instance;
    }

}
