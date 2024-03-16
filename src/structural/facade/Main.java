package structural.facade;

import java.math.BigDecimal;
import java.util.Locale;
import net.datafaker.Faker;
import structural.facade.model.RealOnlineStore;

/*
* Pattern facade simplified access to complex sets of libraries or frameworks
*/
public class Main {
    private final static Faker faker = new Faker(Locale.getDefault());

    public static void main(String[] args) {
        RealOnlineStore onlineStore = new RealOnlineStore();

        onlineStore.addToBucket(
                faker.commerce().productName(),
                BigDecimal.valueOf(faker.random().nextDouble(100., 10000.))
        );
        onlineStore.addToBucket(
                faker.commerce().productName(),
                BigDecimal.valueOf(faker.random().nextDouble(100., 10000.))
        );
        onlineStore.addToBucket(
                faker.commerce().productName(),
                BigDecimal.valueOf(faker.random().nextDouble(100., 10000.))
        );
        onlineStore.addToBucket(
                faker.commerce().productName(),
                BigDecimal.valueOf(faker.random().nextDouble(100., 10000.))
        );

        onlineStore.buy();
    }
}
