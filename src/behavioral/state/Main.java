package behavioral.state;

import behavioral.state.model.Machine;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();

        machine.turnOf();
        machine.startPreparing();
        machine.finishPreparing();
        machine.issue();
        machine.turnOn();
        machine.turnOn();
        machine.startPreparing();
        machine.finishPreparing();
        machine.issue();
        machine.turnOf();
    }
}
