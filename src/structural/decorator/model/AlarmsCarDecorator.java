package structural.decorator.model;

import java.math.BigDecimal;

public class AlarmsCarDecorator extends CarDecorator {
    public AlarmsCarDecorator(Car car) {
        super(car);
    }


    @Override
    public String getDescription() {
        return car.getDescription() + ", Сигналізація";
    }

    @Override
    public BigDecimal getPrice() {
        return car.getPrice().add(BigDecimal.valueOf(600)) ;
    }
}
