package behavioral.state.model;

public class OffState extends AbstractMachineState {
    public OffState(Machine machine) {
        super(machine);
    }

    @Override
    public void turnOn() {
        System.out.println("Включаю машину");
        machine.setState(machine.READY_STATE);
    }

    @Override
    public void turnOff() {
        System.out.println("Машина вже виключена");
    }

    @Override
    public void startPreparation() {
        System.out.println("Не можу почати приготування. Машина виключена");
    }

    @Override
    public void finishPreparation() {
        System.out.println("Не можу завершити приготування. Машина виключена");
    }

    @Override
    public void issuance() {
        System.out.println("Не можу видати продукт. Машина виключена");
    }
}
