package structural.facade.repository;

import java.util.Random;
import structural.facade.model.Order;

public class OnlineStoreRepository {
    public void save(Order order) {
        System.out.println("Зберігаю замовлення "+ order.id());
        Random random = new Random();
        for (int i = 0; i < 3; ++i) {
            try {
                Thread.sleep(random.nextInt(50, 250));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println("\nЗбережено");
    }
}
