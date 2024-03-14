package structural.facade.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class RealOnlineStore implements OnlineStore {
    private final OnlineStoreFacade onlineStoreFacade;
    private List<Product> bucket;

    {
        onlineStoreFacade = new OnlineStoreFacade();
        bucket = new ArrayList<>();
    }

    @Override
    public void addToBucket(Product product) {
        bucket.add(product);
    }
    public void addToBucket(String name, BigDecimal price) {
        bucket.add(new Product(name, price));
    }

    @Override
    public void removeFromBucket(Product product) {
        bucket.remove(product);
    }

    @Override
    public void buy() {
        formOrder(bucket);
    }

    private void formOrder(List<Product> products) {
        BigDecimal sum = new BigDecimal(0);
        for (var p: products) {
            sum = sum.add(p.price());
        }
        Order newOrder = new Order(UUID.randomUUID().toString(), List.copyOf(bucket), sum);
        bucket.clear();
        execOrder(newOrder);
    }

    private void execOrder(Order order) {
        onlineStoreFacade.doAllOperations(order);
    }
}
