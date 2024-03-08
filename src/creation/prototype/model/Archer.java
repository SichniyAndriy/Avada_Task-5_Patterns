package creation.prototype.model;

import java.util.List;

public class Archer extends Unit {
    private Archer(Unit unit) {
        super(unit);
    }

    public Archer(String weapon, int points, List<String> archerEquipment) {
        super(weapon, points, archerEquipment);
    }

    @Override
    public Archer doClone() throws CloneNotSupportedException {
        return new Archer(this);
    }

}
