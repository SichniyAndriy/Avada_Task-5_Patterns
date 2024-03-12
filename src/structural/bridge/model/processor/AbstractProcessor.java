package structural.bridge.model.processor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import structural.bridge.model.program.AbstractProgram;

@Getter
@AllArgsConstructor
public class AbstractProcessor implements Processor {
    protected String codeName;
    protected long frequency;
    protected long transistors;
    protected int cores;

    @Override
    public void execute(AbstractProgram program) {
        if (program != null && program.doAction()) {
            System.out.println("Виконую програму " + program.getName());
        }
    }
}
