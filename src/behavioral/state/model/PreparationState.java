package behavioral.state.model;

public class PreparationState extends AbstractMachineState {
    public PreparationState(Machine machine) {
        super(machine);
    }

    @Override
    public void turnOn() {
        System.out.println("Машина вже включена. Готую продукт");
    }

    @Override
    public void turnOff() {
        System.out.println("Машина ще готує. Дочекайтесь видачі");
    }

    @Override
    public void startPreparation() {
        System.out.println("Машина ще готує. Не можу почати нове приготування");
    }

    @Override
    public void finishPreparation() {
        System.out.println("Продукт готовий");
        machine.setState(machine.ISSUANCE_STATE);
    }

    @Override
    public void issuance() {
        System.out.println("Машина ще готує. Дочекайтесь приготування");
    }
}
