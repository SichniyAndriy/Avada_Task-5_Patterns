package creation.prototype.model;

import java.util.List;

public class Warrior extends Unit {
    private Warrior(Unit unit) {
        super(unit);
    }

    public Warrior(String weapon, Integer points, List<String> equipment) {
        super(weapon, points, equipment);
    }

    @Override
    public Warrior doClone() throws CloneNotSupportedException {
        return new Warrior(this);
    }
}
