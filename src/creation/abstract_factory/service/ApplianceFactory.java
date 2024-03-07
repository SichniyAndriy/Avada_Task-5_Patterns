package creation.abstract_factory.service;

import creation.abstract_factory.model.Appliance;

public interface ApplianceFactory {
    Appliance createFridge();

    Appliance createGasStove();

    Appliance createMicrowaveOven();

    Appliance createVacuumCleaner();

    Appliance createWashingMachine();

}
