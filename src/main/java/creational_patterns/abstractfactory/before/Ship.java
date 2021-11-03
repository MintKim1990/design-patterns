package creational_patterns.abstractfactory.before;

import lombok.Data;

@Data
public class Ship {

    private String name;
    private String logo;
    private String color;
    private WhiteAnchor anchor;
    private WhiteWheel wheel;
}
