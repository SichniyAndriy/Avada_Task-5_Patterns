package creation.builder;

import creation.builder.model.Tank;
import creation.builder.service.HeavyTankBuilder;
import creation.builder.service.LightTankBuilder;
import creation.builder.service.MiddleTankBuilder;
import creation.builder.service.TankBuilder;
import creation.builder.service.TankBuilderDirector;


/*
* Pattern Builder provides interface for producing complex objects
* step-by-step. It lets separate creation logic from its representation
*/
public class Main {
    public static void main(String[] args) {
        TankBuilderDirector director = new TankBuilderDirector();

        TankBuilder lightTankBuilder = new LightTankBuilder();
        TankBuilder middleTankBuilder = new MiddleTankBuilder();
        TankBuilder heavyTankBuilder = new HeavyTankBuilder();

        Tank lightTank = director.buildTank(lightTankBuilder);
        Tank middleTank = director.buildTank(middleTankBuilder);
        Tank heavyTank = director.buildTank(heavyTankBuilder);

        System.out.println(lightTank.toString());
        System.out.println(middleTank.toString());
        System.out.println(heavyTank.toString());
    }
}
