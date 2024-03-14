package structural.flyweight.util;

import java.util.HashMap;
import java.util.Map;
import structural.flyweight.model.Symbol;
import structural.flyweight.model.TextSymbol;

public class SymbolsPool {
    private final Map<Symbol, Symbol> cache = HashMap.newHashMap(32);

    public Symbol getSymbol(char ch, String font, int size, String color) {
        Symbol key = TextSymbol.of(ch, font, size, color);
        Symbol symbol = cache.get(key);
        if (symbol == null) {
            System.out.println("Створюю символ " + key);
        }
        return cache.computeIfAbsent(key, k -> k);
    }

    public int getSizeCache() {
        return cache.size();
    }
}
