package structural_patterns.composite.after;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item implements Component{

    private String name;
    private int price;

    @Override
    public int getPrice() {
        return this.price;
    }

}
