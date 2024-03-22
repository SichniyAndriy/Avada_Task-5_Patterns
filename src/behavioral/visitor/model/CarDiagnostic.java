package behavioral.visitor.model;

import behavioral.visitor.model.car.Body;
import behavioral.visitor.model.car.Engine;
import behavioral.visitor.model.car.Wheel;

public class CarDiagnostic implements CarVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Діагностую " + body.getName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Діагностую " + engine.getName());
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Діагностую " + wheel.getName());
    }
}
