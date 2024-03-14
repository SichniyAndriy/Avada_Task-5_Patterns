package structural.flyweight.util;

import java.util.HashMap;
import java.util.Map;
import structural.flyweight.model.Symbol;
import structural.flyweight.model.TextSymbol;

public class SymbolsPool {
    private final Map<String, Symbol> cache = HashMap.newHashMap(64);

    public Symbol getSymbol(char ch, String font, int size, String color) {
        String key = ch + font + size + color;
        Symbol value = cache.get(key);
        if (value == null) {
            System.out.println(
                    "Створюю символ " + ch + ", шрифтом " + font + ", розміром " + size + ", колір " + color
            );
            value = TextSymbol.of(ch, font, size, color);
            cache.put(key, value);
        }
        return value;
    }

    public int getSizeCache() {
        return cache.size();
    }
}
