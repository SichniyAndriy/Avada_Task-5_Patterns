package creation.builder.service;

import creation.builder.model.Tank;
import java.util.UUID;
import net.datafaker.Faker;

public class MiddleTankBuilder implements TankBuilder {
    private final static String NAME = "Середній танк";
    private final static String TEXT = " середнього танка";
    private Tank tank;

    @Override
    public void init() {
        tank = new Tank();
    }

    @Override
    public MiddleTankBuilder setIdAndName() {
        tank.setId(UUID.randomUUID().toString());
        tank.setName(NAME);
        return this;
    }

    @Override
    public MiddleTankBuilder setWeight() {
        tank.setWeight(new Faker().random().nextInt(21, 40));
        return this;
    }

    @Override
    public MiddleTankBuilder buildBase() {
        tank.setBase(BASE + TEXT);
        return this;
    }

    @Override
    public MiddleTankBuilder buildChassis() {
        tank.setChassis(CHASSIS + TEXT);
        return this;
    }

    @Override
    public MiddleTankBuilder buildEngine() {
        tank.setEngine(ENGINE + TEXT);
        return this;
    }

    @Override
    public MiddleTankBuilder buildTower() {
        tank.setTower(TOWER + TEXT);
        return this;
    }

    @Override
    public MiddleTankBuilder setGun() {
        tank.setGun(GUN + TEXT);
        return this;
    }

    @Override
    public MiddleTankBuilder setMachineGun() {
        tank.setMachineGun(MACHINE_GUM + TEXT);
        return this;
    }

    @Override
    public Tank build() {
        Tank tmp = tank;
        tank = null;
        return tmp;
    }

}
