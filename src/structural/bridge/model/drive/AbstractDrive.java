package structural.bridge.model.drive;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AbstractDrive implements Drive {
    protected String manufacturer;
    protected long capacity;

    @Override
    public void read() {
        System.out.println("Читаю дані з диска");
    }

    @Override
    public void write() {
        System.out.println("Записую дані на диск");
    }
}
