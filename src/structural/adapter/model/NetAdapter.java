package structural.adapter.model;

import java.util.Arrays;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NetAdapter implements Channel{
    private Cable cable;
    private int packetSize;

    @Override
    public void sendPacket(int value) {
        System.out.print("Передаю сигнали в інтернет => ");
        char[] signals = new char[packetSize];

        Arrays.fill(signals, '0');
        char[] tmp = Integer.toBinaryString(value).toCharArray();
        int lenTmp = tmp.length;
        int lenSignals = packetSize;
        while(--lenTmp >= 0) {
            signals[--lenSignals] = tmp[lenTmp];
        }
        for (char ch: signals) {
            cable.sendSignal(ch);
            hold();
        }
        System.out.println();
    }

    @Override
    public int receivePacket() {
        System.out.print("Отримую сигнали з інтернета <= ");
        StringBuilder stringBuilder;
        char ch;
        stringBuilder = new StringBuilder();

        for (int j = 0; j < packetSize; ++j) {
            ch = cable.receiveSignal();
            stringBuilder.append(ch);
            System.out.print(ch);
            hold();
        }
        String bynaryString = stringBuilder.toString();
        int anInt = Integer.parseInt(bynaryString.substring(1), 2);
        if (bynaryString.charAt(0) == '1') {
            anInt *= -1;
        }

        System.out.println();
        return anInt;
    }

    private void hold() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
