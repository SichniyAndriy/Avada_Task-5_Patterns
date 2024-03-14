package structural.facade.model;

public interface OnlineStore {
    void addToBucket(Product product);

    void removeFromBucket(Product product);

    void buy();
}
