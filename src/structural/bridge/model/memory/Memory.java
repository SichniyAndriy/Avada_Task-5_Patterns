package structural.bridge.model.memory;

import structural.bridge.model.program.Program;

public interface Memory {
    void load(Program data);

    void unload(Program data);

}
