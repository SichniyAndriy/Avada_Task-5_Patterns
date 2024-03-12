package structural.bridge.model.drive;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AbstractDrive implements Drive {
    protected String manufacturer;
    protected long capacity;

    @Override
    public boolean read(String data) {
        System.out.println("Читаю дані з диска");
        return true;
    }

    @Override
    public boolean write(String data) {
        System.out.println("Записую дані на диск");
        return true;
    }

    @Override
    public boolean delete(String data) {
        System.out.println("видаляю дані з диска");
        return true;
    }
}
