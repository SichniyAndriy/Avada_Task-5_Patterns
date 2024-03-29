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
    public void load(Program program) {
        if (program != null) {
            AbstractProgram p = (AbstractProgram) program;
            System.out.println(p.getName() + " завантажує дані: " + p.getData());
            System.out.println(p.getData() + " завантажено");
        }
    }

    @Override
    public void unload(Program program) {
        if (program != null) {
            AbstractProgram p = (AbstractProgram) program;
            System.out.println(p.getName() + " вивантажує дані: " + p.getData());
            System.out.println(p.getData() + " вивантажено");
        }
    }

}
