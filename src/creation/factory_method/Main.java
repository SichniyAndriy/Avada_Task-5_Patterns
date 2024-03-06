package creation.factory_method;

import creation.factory_method.service.LogisticCompany;
import creation.factory_method.service.RoadLogisticCompany;
import creation.factory_method.service.SeaLogisticCompany;
import java.util.Locale;
import net.datafaker.Faker;

public class Main {
    private static final Faker faker =new Faker(Locale.getDefault());

    public static void main(String[] args) {
        String name = faker.company().name();
        String logo = faker.company().logo();
        LogisticCompany roadLogisticCompany = RoadLogisticCompany.create(name, logo);

        int len = faker.random().nextInt(5, 15);
        for (int i = 0; i < len; ++i) {
            double mass = faker.random().nextInt(10, 30);
            String cityFrom = faker.address().city();
            String cityTo = faker.address().city();
            roadLogisticCompany.formOrder(mass, cityFrom, cityTo);
        }
        System.out.println();

        name = faker.company().name();
        logo = faker.company().logo();
        LogisticCompany seaLogisticCompany = SeaLogisticCompany.create(name, logo);
        for (int i = 0; i < len; ++i) {
            double mass = faker.random().nextInt(1000, 8000);
            String cityFrom = faker.address().city();
            String cityTo = faker.address().city();
            seaLogisticCompany.formOrder(mass, cityFrom, cityTo);
        }
    }
}
