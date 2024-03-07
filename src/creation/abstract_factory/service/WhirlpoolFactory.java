package creation.abstract_factory.service;

import creation.abstract_factory.model.Appliance;
import creation.abstract_factory.model.whirlpool.WhirlpoolFridge;
import creation.abstract_factory.model.whirlpool.WhirlpoolGasStove;
import creation.abstract_factory.model.whirlpool.WhirlpoolMicrowaveOven;
import creation.abstract_factory.model.whirlpool.WhirlpoolVacuumCleaner;
import creation.abstract_factory.model.whirlpool.WhirlpoolWashingMachine;


public class WhirlpoolFactory implements ApplianceFactory {
    @Override
    public Appliance createFridge() {
        return new WhirlpoolFridge();
    }

    @Override
    public Appliance createGasStove() {
        return new WhirlpoolGasStove();
    }

    @Override
    public Appliance createMicrowaveOven() {
        return new WhirlpoolMicrowaveOven();
    }

    @Override
    public Appliance createVacuumCleaner() {
        return new WhirlpoolVacuumCleaner();
    }

    @Override
    public Appliance createWashingMachine() {
        return new WhirlpoolWashingMachine();
    }

}
