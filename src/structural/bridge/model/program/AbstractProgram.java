package structural.bridge.model.program;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AbstractProgram implements Program {
    protected String name;
    protected String data;

    @Override
    public boolean doAction() {
        System.out.println(this.getClass().getSimpleName() + " запускається...");
        return true;
    }

}
