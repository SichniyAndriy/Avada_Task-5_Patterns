package structural.adapter;

import java.util.Random;
import structural.adapter.model.NetAdapter;
import structural.adapter.model.RealCable;

/*
* Pattern Adapter allows  two objects with different interfaces to collaborate
*/
public class Main {
    private final static int PACKET_SIZE = 32;
    private final static int PACKET_AMOUNT = 4;

    public static void main(String[] args) {
        NetAdapter netAdapter = new NetAdapter(new RealCable(), PACKET_SIZE);

        Random random = new Random();
        int sent, received;

        for (int i = 0; i < PACKET_AMOUNT; i++) {
            sent = random.nextInt();
            System.out.println("Передаю пакет адаптеру => " + sent);
            netAdapter.sendPacket(sent);

            received = netAdapter.receivePacket();
            System.out.print("Отримую пакет з адаптеру <= " + received);

            System.out.println();
        }
    }
}
