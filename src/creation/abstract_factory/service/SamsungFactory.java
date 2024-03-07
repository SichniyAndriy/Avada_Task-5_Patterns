package creation.abstract_factory.service;

import creation.abstract_factory.model.Appliance;
import creation.abstract_factory.model.samsung.SamsungFridge;
import creation.abstract_factory.model.samsung.SamsungGasStove;
import creation.abstract_factory.model.samsung.SamsungMicrowaveOven;
import creation.abstract_factory.model.samsung.SamsungVacuumCleaner;
import creation.abstract_factory.model.samsung.SamsungWashingMachine;

public class SamsungFactory implements ApplianceFactory {
    @Override
    public Appliance createFridge() {
        return new SamsungFridge();
    }

    @Override
    public Appliance createGasStove() {
        return new SamsungGasStove();
    }

    @Override
    public Appliance createMicrowaveOven() {
        return new SamsungMicrowaveOven();
    }

    @Override
    public Appliance createVacuumCleaner() {
        return new SamsungVacuumCleaner();
    }

    @Override
    public Appliance createWashingMachine() {
        return new SamsungWashingMachine();
    }

}
