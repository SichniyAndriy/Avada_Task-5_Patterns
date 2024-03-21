package behavioral.state.model;

public class ReadyState extends AbstractMachineState {
    public ReadyState(Machine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    public void turnOn() {
        System.out.println("Машина вже включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Виключаю машину");
        machine.setState(machine.OFF_STATE);
    }

    @Override
    public void startPreparation() {
        System.out.println("Готую продукт");
        machine.setState(machine.PREPARATION_STATE);
    }

    @Override
    public void finishPreparation() {
        System.out.println("Запустіть приготування продукту");
    }

    @Override
    public void issuance() {
        System.out.println("Спочатку треба приготувати продукт");
    }
}
