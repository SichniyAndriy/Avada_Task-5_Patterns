package structural.proxy.model;

import java.util.Locale;
import net.datafaker.Faker;

public class RealFile implements File {
    private final String name;
    private String content;

    public RealFile(String filename) {
        this.name = filename;
        loadContent(filename);
    }

    @Override
    public void display() {
        System.out.println("Файл " + name + ": " + content);
    }

    private void loadContent(String filename) {
        content = (new Faker(Locale.getDefault())).text().text(10, 50);
    }

}
