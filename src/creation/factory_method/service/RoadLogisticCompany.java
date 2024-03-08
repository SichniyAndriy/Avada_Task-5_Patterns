package creation.factory_method.service;

import creation.factory_method.model.RoadTransport;
import creation.factory_method.model.Transport;
import java.text.NumberFormat;
import java.util.Locale;
import lombok.NoArgsConstructor;
import net.datafaker.Faker;

@NoArgsConstructor
public final class RoadLogisticCompany extends AbstractLogisticCompany {

    public static RoadLogisticCompany create(String name, String logo) {
        return new RoadLogisticCompany(name, logo);
    }

    private RoadLogisticCompany(String name, String logo) {
        super(name,logo);
    }

    @Override
    protected Transport buyTransport() {
        Faker faker = new Faker(Locale.getDefault());
        double payload = faker.random().nextDouble(10., 40.);
        logger.info("переглядає ванжівку вантажопід'йомністю " + NumberFormat.getNumberInstance().format(payload));
        return new RoadTransport(payload);
    }
}
