package structural.facade.service;

import java.math.RoundingMode;
import java.util.Random;
import structural.facade.model.Order;

public class PaymentService {
    public void doPayment(Order order) {
        System.out.println(
                "Роблю оплату по замовленню "+ order.id() +
                " в розмірі " + order.price().setScale(2, RoundingMode.DOWN) + " грн."
        );
        Random random = new Random();
        for (int i = 0; i < 3; ++i) {
            try {
                Thread.sleep(random.nextInt(50, 250));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println("\nОплачено");
    }
}
