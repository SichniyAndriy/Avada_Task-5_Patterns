package creation.builder.service;

import creation.builder.model.Tank;

public interface TankBuilder {
    String BASE = "Корпус";
    String CHASSIS = "Шасі";
    String ENGINE = "Двигун";
    String TOWER = "Башта";
    String GUN = "Гармата";
    String MACHINE_GUM = "Кулемет";

    void init();

    TankBuilder setIdAndName();

    TankBuilder setWeight();

    TankBuilder buildBase();

    TankBuilder buildChassis();

    TankBuilder buildEngine();

    TankBuilder buildTower();

    TankBuilder setGun();

    TankBuilder setMachineGun();

    Tank build();

}
