package behavioral.state.model;

import lombok.Setter;

public class Machine {
    @Setter
    private MachineState state;

    public final MachineState READY_STATE;
    public final MachineState OFF_STATE;
    public final MachineState PREPARATION_STATE;
    public final MachineState ISSUANCE_STATE;


    public Machine() {
        READY_STATE = new ReadyState(this);
        OFF_STATE = new OffState(this);
        PREPARATION_STATE = new PreparationState(this);
        ISSUANCE_STATE = new IssuanceState(this);
        state = OFF_STATE;
    }

    public void turnOn() {
        state.turnOn();
    }

    public void turnOf() {
        state.turnOff();
    }

    public void startPreparing() {
        state.startPreparation();
    }

    public void finishPreparing() {
        state.finishPreparation();
    }

    public void issue() {
        state.issuance();
    }
}
