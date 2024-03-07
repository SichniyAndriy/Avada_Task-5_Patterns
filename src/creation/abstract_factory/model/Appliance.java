package creation.abstract_factory.model;

public interface Appliance {
    default String turnOn() {
        return "Вмикаю " + this.getClass();
    }

    default String use() {
        return "Користуюсь " + this.getClass();
    }

    default String turnOff() {
        return "Вимикаю" + this.getClass();
    }
}
