package creation.builder.service;

import creation.builder.model.Tank;
import java.util.UUID;
import net.datafaker.Faker;

public class LightTankBuilder implements TankBuilder {
    private final static String NAME = "Легкий танк";
    private final static String TEXT = " легкого танка";
    private Tank tank;

    @Override
    public void init() {
        tank = new Tank();
    }

    @Override
    public LightTankBuilder setIdAndName() {
        tank.setId(UUID.randomUUID().toString());
        tank.setName(NAME);
        return this;
    }

    @Override
    public LightTankBuilder setWeight() {
        tank.setWeight(new Faker().random().nextInt(5, 20));
        return this;
    }

    @Override
    public LightTankBuilder buildBase() {
        tank.setBase(BASE + TEXT);
        return this;
    }

    @Override
    public LightTankBuilder buildChassis() {
        tank.setChassis(CHASSIS + TEXT);
        return this;
    }

    @Override
    public LightTankBuilder buildEngine() {
        tank.setEngine(ENGINE + TEXT);
        return this;
    }

    @Override
    public LightTankBuilder buildTower() {
        tank.setTower(TOWER + TEXT);
        return this;
    }

    @Override
    public LightTankBuilder setGun() {
        tank.setGun(GUN + TEXT);
        return this;
    }

    @Override
    public LightTankBuilder setMachineGun() {
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
