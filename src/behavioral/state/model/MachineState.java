package behavioral.state.model;

public interface MachineState {
    void turnOn();

    void turnOff();

    void startPreparation();

    void finishPreparation();

    void issuance();
}
