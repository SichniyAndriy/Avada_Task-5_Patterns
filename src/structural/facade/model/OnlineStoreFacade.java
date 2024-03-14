package structural.facade.model;

import structural.facade.repository.OnlineStoreRepository;
import structural.facade.service.NotificationService;
import structural.facade.service.PaymentService;

public class OnlineStoreFacade {
    private final PaymentService paymentService;
    private final OnlineStoreRepository repository;
    private final NotificationService notificationService;

    {
        paymentService = new PaymentService();
        repository = new OnlineStoreRepository();
        notificationService = new NotificationService();
    }

    public void doAllOperations(Order order) {
        makePayment(order);
        saveOrderInfo(order);
        sendNotification(order);
    }

    private void makePayment(Order order) {
        paymentService.doPayment(order);
    }

    private void saveOrderInfo(Order order) {
        repository.save(order);
    }

    private void sendNotification(Order order) {
        notificationService.sendMessage(order);
    }
}
