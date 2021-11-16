package structural_patterns.composite.before;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bag {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

}
