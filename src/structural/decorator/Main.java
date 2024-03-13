package structural.decorator;

import java.math.BigDecimal;
import structural.decorator.model.AlarmsCarDecorator;
import structural.decorator.model.BasicCar;
import structural.decorator.model.Car;
import structural.decorator.model.CarDecorator;
import structural.decorator.model.CruiseControlCarDecorator;
import structural.decorator.model.MetallicColorCarDecorator;

public class Main {
    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar("Базова машина", BigDecimal.valueOf(23000));
        showCar(basicCar);

        CarDecorator carWithAlarms = new AlarmsCarDecorator(basicCar);
        showCar(carWithAlarms);

        CarDecorator carInMetallicWithAlarms = new MetallicColorCarDecorator(carWithAlarms);
        showCar(carInMetallicWithAlarms);

        CarDecorator carInMetallicWithCruiseAndAlarms = new CruiseControlCarDecorator(carInMetallicWithAlarms);
        showCar(carInMetallicWithCruiseAndAlarms);
    }

    static void showCar(Car car) {
        System.out.println("Опис: " + car.getDescription());
        System.out.println("Ціна: " + car.getPrice() + " $");
    }
}
