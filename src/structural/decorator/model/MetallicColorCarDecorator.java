package structural.decorator.model;

import java.math.BigDecimal;

public class MetallicColorCarDecorator extends CarDecorator {
    public MetallicColorCarDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Колір металлік";
    }

    @Override
    public BigDecimal getPrice() {
        return car.getPrice().add(BigDecimal.valueOf(860));
    }
}
