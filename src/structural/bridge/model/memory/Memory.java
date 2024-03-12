package structural.bridge.model.memory;

import structural.bridge.model.program.Program;

public interface Memory {
    boolean load(Program data);

    boolean unload(Program data);

}
