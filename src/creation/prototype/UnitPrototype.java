package creation.prototype;

import creation.prototype.model.Unit;

public interface UnitPrototype {
    Unit doClone() throws CloneNotSupportedException;
}
