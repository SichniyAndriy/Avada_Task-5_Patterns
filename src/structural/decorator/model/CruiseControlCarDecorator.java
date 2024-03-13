package structural.decorator.model;

import java.math.BigDecimal;

public class CruiseControlCarDecorator extends CarDecorator {
    public CruiseControlCarDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Круіз контроль";
    }

    @Override
    public BigDecimal getPrice() {
        return car.getPrice().add(BigDecimal.valueOf(1300));
    }
}
