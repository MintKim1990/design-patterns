package creational_patterns.builder.before;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class DetailPlan {

    private int day;

    private String plan;

}
