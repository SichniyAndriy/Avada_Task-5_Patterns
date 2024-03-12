package structural.bridge.model.drive;

public interface Drive {
    boolean read(String data);

    boolean write(String data);

    boolean delete(String data);

}
