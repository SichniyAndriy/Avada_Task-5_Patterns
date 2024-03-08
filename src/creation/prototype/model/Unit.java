package creation.prototype.model;

import creation.prototype.UnitPrototype;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Unit implements UnitPrototype {
    protected String weapon;
    protected Integer pointOfLife;
    protected List<String> equipment;

    protected Unit(Unit unit) {
        this.weapon = unit.weapon;
        this.pointOfLife = unit.pointOfLife;
        this.equipment = new ArrayList<>(unit.equipment);
    }

    @Override
    public Unit doClone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Impossible to clone abstract class. Override doCLone method in subclass");
    }
}
