package structural_patterns.bridge.after;

public class App {

    public static void main(String[] args) {

        /**
         * Champion 이라는 성격의 인터페이스, Skin 이라는 성격의 인터페이스는 서로 성격이 다른 객체로
         * DefaultChampion 이라는 추상클래스가 Champion, Skin 인터페이스를 연결하는 브릿지역활을 수행한다.
         *
         * 이렇게 성격이 다른 객체들을 하나로 엮는 패턴을 브릿지패턴이라한다.
         *
         * 장점
         * 1. 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다. 예를들어 스킨을 계속해서 추가
         * 2. 추상적인 코드와 구체적인 코드를 분리할 수 있다.
         *
         * 단점
         * 1. 계층 구조가 늘어나 복잡도가 증가할 수 있다.
         */

        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillR();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillQ();
        poolParty아리.skillR();

    }

}
