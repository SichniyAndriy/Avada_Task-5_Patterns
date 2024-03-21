package behavioral.state.model;

public class IssuanceState extends AbstractMachineState {
    public IssuanceState(Machine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    public void turnOn() {
        System.out.println("Машина включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Заберіть готовий продукт");
    }

    @Override
    public void startPreparation() {
        System.out.println("Для початку нового приготування, заберіть готовий продукт");
    }

    @Override
    public void finishPreparation() {

    }

    @Override
    public void issuance() {
        System.out.println("Заберіть готовий продукт");
        machine.setState(machine.READY_STATE);
    }
}
