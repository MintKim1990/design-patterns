package behavioral_patterns.visitor.before;

public class Circle implements Shape {

    @Override
    public void printTo(Phone phone) {
        System.out.println("print Circle to phone");
    }

    @Override
    public void printTo(Watch watch) {
        System.out.println("print Circle to watch");
    }
}
