package behavioral.visitor.model.car;

import behavioral.visitor.model.CarVisitor;

public class Wheel extends AbstractCarElement {
    public Wheel(String name) {
        super(name);
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
