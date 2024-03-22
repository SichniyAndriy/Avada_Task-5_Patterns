package behavioral.visitor.model.car;

import behavioral.visitor.model.CarVisitor;

public interface CarElement {
   void accept(CarVisitor visitor);
}
