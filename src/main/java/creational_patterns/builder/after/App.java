package creational_patterns.builder.after;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        /**
         *
         * 복잡한 객체에서 원하는 Set만 설정하여 객체를 생성할수있다.
         *
         * 빌더패턴이 아닐경우 생성자나 세터를 통해서 설정해야하며 가독성뿐만아니라 코드도 복잡해지지만
         * 빌더패턴을 적용하게될경우 원하는 Set만 설정하여 객체를 생성하는 메소드한번만 호출하면 가독성도 좋아지며
         * 직관적인 코드가 완성된다.
         *
         */

        TourDirector tourDirector = new TourDirector(
                new DefaultTourBuilder()
        );

        TourPlan plan = tourDirector.cancunTrip();

        TourPlan longBeachTrip = tourDirector.longBeachTrip();


    }

}
