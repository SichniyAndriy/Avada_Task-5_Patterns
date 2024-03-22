package behavioral.visitor.model.car;

import behavioral.visitor.model.CarVisitor;

public class Engine extends AbstractCarElement{
    public Engine(String name) {
        super(name);
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
