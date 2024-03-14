package structural.flyweight.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class TextSymbol implements Symbol {
    private final char ch;
    private final String font;
    private final int size;
    private final String color;

    private TextSymbol(char ch, String font, int size, String color) {
        this.ch = ch;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public static TextSymbol of(char ch, String font, int size, String color) {
        return new TextSymbol(ch, font, size, color);
    }

    @Override
    public void draw() {
        System.out.println(
                "Відображаю символ " + ch + ", шрифтом " + font + ", розміром " + size + ", колір " + color
        );
    }
}
