package creational_patterns.abstractfactory.after;

import lombok.Data;

@Data
public class Ship {

    private String name;
    private String logo;
    private String color;
    private Anchor anchor;
    private Wheel wheel;
}
