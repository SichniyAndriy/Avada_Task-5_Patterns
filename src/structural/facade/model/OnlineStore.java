package structural.facade.model;

import java.util.List;

public interface OnlineStore {
    void addToBucket(Product product);

    void removeFromBucket(Product product);

    void buy();
}
