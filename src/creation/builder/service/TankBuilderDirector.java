package creation.builder.service;

import creation.builder.model.Tank;

public class TankBuilderDirector {
    public Tank buildTank(TankBuilder builder) {
        builder.init();
        return builder
                .setIdAndName()
                .setWeight()
                .buildBase()
                .buildChassis()
                .buildEngine()
                .buildTower()
                .setGun()
                .setMachineGun()
                .build();
    }

}
