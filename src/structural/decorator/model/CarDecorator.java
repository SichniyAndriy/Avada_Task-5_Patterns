package structural.decorator.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CarDecorator implements Car {
    protected final Car car;

    @Override
    public String getDescription() {
        throw new RuntimeException("Вам треба перевизначити метод getDescription() в підкласі");
    }

    @Override
    public BigDecimal getPrice() {
        throw new RuntimeException("Вам треба перевизначити метод getPrice() в підкласі");
    }

}
