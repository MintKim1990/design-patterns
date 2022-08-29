package behavioral_patterns.visitor.before;

public interface Shape {
    void printTo(Phone phone);

    void printTo(Watch watch);
}
