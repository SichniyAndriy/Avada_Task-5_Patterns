package structural.decorator.model;

import java.math.BigDecimal;

public class SpoilerCarDecorator extends CarDecorator {
    public SpoilerCarDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Спойлер";
    }

    @Override
    public BigDecimal getPrice() {
        return car.getPrice().add(BigDecimal.valueOf(350));
    }
}
