package structural.bridge.model.memory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import structural.bridge.model.program.AbstractProgram;
import structural.bridge.model.program.Program;

@Getter
@AllArgsConstructor
public class AbstractMemory implements Memory {
    protected long frequency;
    protected long capacity;

    @Override
    public boolean load(Program program) {
        if (program != null) {
            AbstractProgram p = (AbstractProgram) program;
            System.out.println(p.getName() + " завантажує дані: " + p.getData());
            System.out.println(p.getData() + " завантажено");
            return true;
        }
        return false;
    }

    @Override
    public boolean unload(Program program) {
        if (program != null) {
            AbstractProgram p = (AbstractProgram) program;
            System.out.println(p.getName() + " вивантажує дані: " + p.getName());
            System.out.println(p.getData() + " вивантажено");
            return true;
        }
        return false;
    }

}
