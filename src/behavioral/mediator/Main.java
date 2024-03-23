package behavioral.mediator;

import behavioral.mediator.model.FlightControlCenter;
import behavioral.mediator.model.FlightDispatcher;
import behavioral.mediator.model.Plane;
import java.util.Locale;
import net.datafaker.Faker;

/*
* Pattern Mediator lets reduce dependencies between object
*/
public class Main {
    public final static Faker faker = new Faker(Locale.getDefault());

    public static void main(String[] args) {
        FlightControlCenter flightDispatcher = new FlightDispatcher();
        int len = faker.random().nextInt(10, 20);
        for (int i = 0; i < len; ++i) {
            Plane plane = new Plane(faker.aviation().airplane());
            plane.register(flightDispatcher);
        }

        flightDispatcher.sendAll("Hi!");
    }
}
