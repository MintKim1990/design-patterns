package creational_patterns.singleton;

import java.util.Objects;

public class Settings3 {

    /**
     * volatile 키워드
     * 기본적으로 변수를 읽어올때 CPU cache에서 데이터를 읽어오는데 멀티스레드 환경에서는 CPU cache에서 읽어오게될경우
     * CPU는 여러개라 CPU cache에 변수값이 각 스레드별로 다를수가있다.
     *
     * volatile 키워드는 변수를 CPU cache에서 읽지않고 메인 메모리에서 직접 쓰고, 읽기를 한다는 의미로
     * 여러 스레드에서 해당변수에 접근하더라도 메인메모리를 직접 읽고 쓰기때문에 데이터 정합성이 보장된다.
     */
    private static volatile Settings3 instance;

    private Settings3() {}

    /**
     * 멀티스레드 환경에서 동시에 접근하더라도 synchronized 로 인해 Block 처리가되어 thread-safe하며
     * 동시에 접근할경우에만 동기화 처리를 하기때문에 Settings1 객체보다 성능적인부분에서도 이점이있다.
     * @return
     */
    public static Settings3 getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Settings3.class) { // 동기화
                if(Objects.isNull(instance)) {
                    instance = new Settings3();
                }
            }
        }

        return instance;
    }
}
