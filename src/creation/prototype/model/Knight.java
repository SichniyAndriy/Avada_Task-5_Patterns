package creation.prototype.model;

import java.util.List;

public class Knight extends Unit {
    private Knight(Knight knight) {
        super(knight);
    }
    public Knight(String weapon, Integer points, List<String> equipment) {
        super(weapon, points, equipment);
    }

    @Override
    public Knight doClone() throws CloneNotSupportedException {
        return new Knight(this);
    }
}
