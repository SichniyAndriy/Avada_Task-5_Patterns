package behavioral.visitor.model;

import behavioral.visitor.model.car.Body;
import behavioral.visitor.model.car.Engine;
import behavioral.visitor.model.car.Wheel;

public interface CarVisitor {
    void visit(Body body);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
