package structural.decorator.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasicCar implements Car {
    private final String name;
    private final BigDecimal price;

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
