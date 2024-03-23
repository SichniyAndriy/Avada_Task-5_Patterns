package behavioral.visitor;

import behavioral.visitor.model.CarDiagnostic;
import behavioral.visitor.model.CarVisitor;
import behavioral.visitor.model.car.AbstractCarElement;
import behavioral.visitor.model.car.Body;
import java.util.ArrayList;
import java.util.List;

/*
* Pattern Visitor separate logic operating on the object
* from the object it self
*/
public class Main {
    public static void main(String[] args) {
        List<AbstractCarElement> components = new ArrayList<>();
        components.add(new Body("Кузов"));
        components.add(new Body("Двигун"));
        components.add(new Body("Колесо 1"));
        components.add(new Body("Колесо 2"));
        components.add(new Body("Колесо 3"));
        components.add(new Body("Колесо 4"));

        CarVisitor visitor = new CarDiagnostic();

        components.forEach(c -> c.accept(visitor));
    }
}
