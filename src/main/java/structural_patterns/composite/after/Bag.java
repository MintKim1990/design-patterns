package structural_patterns.composite.after;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
