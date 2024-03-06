package creation.factory_method.service;

import creation.factory_method.model.Transport;

public interface LogisticCompany {

    void formOrder(double mass, String from, String to);

    void makeDelivery(Transport transport, String from, String to);

}
