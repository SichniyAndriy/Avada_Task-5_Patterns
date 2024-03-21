package behavioral.state.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractMachineState implements MachineState{
    protected Machine machine;
}
