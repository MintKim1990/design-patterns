package structural_patterns.flyweight.after;

public class Client {

    /**
     * flyweiht 패턴은 정적으로 잘 바뀌지 않는 데이터에 한해 메모리 재사용성이 목적이며
     *
     * Font 관련된 데이터를 Map에 캐싱하여 첫번째 Font에 한해서만 데이터를 생성하고
     * 그 후에는 캐싱된 Map에 Font 데이터를 가져와서 쓰기때문에 메모리가 절약된다.
     *
     * 즉 성능과 관련된 패턴
     *
     * 장점
     * 1. 애플리케이션에서 사용하는 메모리를 줄일 수 있다.
     *
     * 단점
     * 1. 코드가 복잡하다다
     *
     */

    public static void main(String[] args) {

        FontFactory fontFactory = new FontFactory();

        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
        Character c4 = new Character('l', "white", fontFactory.getFont("nanum:12"));
        Character c5 = new Character('o', "white", fontFactory.getFont("nanum:12"));

    }
}
