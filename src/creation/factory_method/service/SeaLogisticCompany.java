package creation.factory_method.service;

import creation.factory_method.model.SeaTransport;
import creation.factory_method.model.Transport;
import java.text.NumberFormat;
import java.util.Locale;
import net.datafaker.Faker;

public class SeaLogisticCompany extends AbstractLogisticCompany {
    public static SeaLogisticCompany create(String name, String logo) {
        return new SeaLogisticCompany(name, logo);
    }

    private SeaLogisticCompany(String name, String logo) {
        super(name,logo);
    }

    @Override
    protected Transport buyTransport() {
        Faker faker = new Faker(Locale.getDefault());
        double payload = faker.random().nextDouble(1000., 10000.);
        logger.info(" переглядає судно вантажопід'йомністю " + NumberFormat.getNumberInstance().format(payload));
        return new SeaTransport(payload);
    }
}
