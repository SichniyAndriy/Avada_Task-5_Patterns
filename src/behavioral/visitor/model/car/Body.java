package behavioral.visitor.model.car;

import behavioral.visitor.model.CarVisitor;

public class Body extends AbstractCarElement {
    public Body(String name) {
        super(name);
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
