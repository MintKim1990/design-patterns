package creational_patterns.singleton;

import java.io.Serializable;

public class Settings4 implements Serializable {

    /**
     * 싱글톤 패턴에서 가장 권장되는 방법
     */

    private Settings4() {}

    /**
     * static inner 클래스
     */
    private static class SettingsHolder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    /**
     * SettingsHolder 클래스는 static inner 클래스로 getInstance 메소드가 호출되는 시점에 로딩되어 지연생성되며
     * 로딩되는 시점에 하나의 INSTACE만 만들기떄문에 thread-safe하다.
     * @return
     */
    public static Settings4 getInstance() {
        return SettingsHolder.INSTANCE; // 지연생성
    }
}
