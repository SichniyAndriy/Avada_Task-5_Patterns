package structural.facade.service;

import java.math.RoundingMode;
import structural.facade.model.Order;

public class NotificationService {
    public void sendMessage(Order order) {
        System.out.print("Ви замовили ");
        StringBuilder stringBuilder = new StringBuilder();
        order.productList().forEach(p -> stringBuilder.append(" ").append(p.name()).append(","));
        System.out.print(stringBuilder.deleteCharAt(stringBuilder.length() - 1));
        System.out.println(" на сумму " + order.price().setScale(2, RoundingMode.DOWN) + " грн.");
    }
}
