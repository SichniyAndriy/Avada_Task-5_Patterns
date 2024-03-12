package structural.adapter.model;

import java.util.Random;

public class RealCable implements Cable {
    private final Random data = new Random();

    @Override
    public void sendSignal(char val) {
        System.out.print(val);
    }

    @Override
    public char receiveSignal() {
        return data.nextBoolean() ? '1' : '0';
    }

}
