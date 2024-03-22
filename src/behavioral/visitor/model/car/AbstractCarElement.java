package behavioral.visitor.model.car;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class AbstractCarElement implements CarElement {
    protected String name;
}
