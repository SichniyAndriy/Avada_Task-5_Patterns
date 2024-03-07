package creation.abstract_factory.service;

import creation.abstract_factory.model.Appliance;
import creation.abstract_factory.model.siemens.SiemensFridge;
import creation.abstract_factory.model.siemens.SiemensGasStove;
import creation.abstract_factory.model.siemens.SiemensMicrowaveOven;
import creation.abstract_factory.model.siemens.SiemensVacuumCleaner;
import creation.abstract_factory.model.siemens.SiemensWashingMachine;


public class SiemensFactory implements ApplianceFactory {
    @Override
    public Appliance createFridge() {
        return new SiemensFridge();
    }

    @Override
    public Appliance createGasStove() {
        return new SiemensGasStove();
    }

    @Override
    public Appliance createMicrowaveOven() {
        return new SiemensMicrowaveOven();
    }

    @Override
    public Appliance createVacuumCleaner() {
        return new SiemensVacuumCleaner();
    }

    @Override
    public Appliance createWashingMachine() {
        return new SiemensWashingMachine();
    }

}
