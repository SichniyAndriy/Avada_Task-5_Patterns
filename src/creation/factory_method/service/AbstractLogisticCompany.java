package creation.factory_method.service;

import creation.factory_method.model.Transport;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import lombok.NoArgsConstructor;
import org.apache.log4j.Logger;

@NoArgsConstructor
public abstract class AbstractLogisticCompany implements LogisticCompany {
    protected String name;
    protected String logo;
    protected Set<Transport> transports = new HashSet<>();
    protected final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    protected AbstractLogisticCompany(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    @Override
    public void formOrder( double mass, String from, String to) {
        logger.info("Нове замовлення вагою " + mass + ". Підшукуєм транспорт");
        Optional<Transport> transport = chooseTransport(mass);
        if (transport.isPresent()) {
            logger.info(" знайшла транспорт");
            makeDelivery(transport.get(), from, to);
        } else {
            logger.info(" не знайшла транспорт. Йдемо на ринок транспорту");
            Transport newTransport;
            do {
                newTransport = buyTransport();
            } while (newTransport.getPayload() < mass);
            transports.add(newTransport);
            logger.info(" купила новий транспорт");
            formOrder(mass, from, to);
        }
    }

    @Override
    public void makeDelivery(Transport transport, String from, String to) {
        transport.followRoute(from, to);
        logger.info(" завершив доставку");
    }

    //Factory method allow to create certain type of transport depending of context
    protected abstract Transport buyTransport();

    protected Optional<Transport> chooseTransport(double mass) {
        if (!transports.isEmpty()) {
            return transports.stream().filter(t -> t.getPayload() >= mass).findFirst();
        }
        return Optional.empty();
    }
}
