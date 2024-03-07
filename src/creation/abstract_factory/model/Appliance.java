package creation.abstract_factory.model;

public interface Appliance {
    default String turnOn() {
        return "Вмикаю " + this.getClass().getSimpleName();
    }

    default String use() {
        return "Користуюсь " + this.getClass().getSimpleName();
    }

    default String turnOff() {
        return "Вимикаю " + this.getClass().getSimpleName();
    }
}
