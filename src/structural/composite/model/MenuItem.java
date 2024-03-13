package structural.composite.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MenuItem implements MenuComponent {
    private String name;
    private BigDecimal price;

    @Override
    public String info() {
        return name + " - " + price.setScale(2, RoundingMode.DOWN) + " грн.";
    }
}
