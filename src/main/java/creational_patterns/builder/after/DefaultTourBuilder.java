package creational_patterns.builder.after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {

    private String title;

    private int night;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans = new ArrayList<>();

    @Override
    public TourPlanBuilder nightsAndDays(int night, int days) {
        this.night = night;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        this.plans.add(
                new DetailPlan(day, plan)
        );
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, night, days, startDate, whereToStay, plans);
    }

}
