package creation.abstract_factory;

import creation.abstract_factory.model.Appliance;
import creation.abstract_factory.service.ApplianceFactory;
import java.util.ArrayList;
import java.util.List;


public class Client {
    private final String brand;
    private final ApplianceFactory applianceFactory;
    private final List<Appliance> appliances = new ArrayList<>();

    public Client(String brand, ApplianceFactory applianceFactory) {
        this.brand = brand;
        this.applianceFactory = applianceFactory;
    }

    public void makePurchases() {
        System.out.println("\nКлієнт заходить в магазин " + brand);
        System.out.println(brand + this.getClass().getSimpleName() + ": купляю техніку");
        appliances.add(applianceFactory.createFridge());
        appliances.add(applianceFactory.createGasStove());
        appliances.add(applianceFactory.createWashingMachine());
        appliances.add(applianceFactory.createMicrowaveOven());
        appliances.add(applianceFactory.createVacuumCleaner());
    }

    public void takeAllHome() {
        System.out.println(brand + this.getClass().getSimpleName() + ": привожу техніку додому");
    }

    public void testPurchases() {
        System.out.println(brand + this.getClass().getSimpleName() + ": тестую техніку");
        for (Appliance appliance: appliances) {
            System.out.println(appliance.turnOn());
            System.out.println(appliance.use());
            System.out.println(appliance.turnOff());
        }
    }
}
