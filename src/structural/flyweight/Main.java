package structural.flyweight;

import java.util.Random;
import structural.flyweight.model.Symbol;
import structural.flyweight.util.SymbolsPool;

public class Main {
    private final static Random random = new Random();

    public static void main(String[] args) {
        int len = random.nextInt(100_000, 250_000);
        SymbolsPool pool = new SymbolsPool();
        Symbol symbol;
        for (int i = 0; i < len; i++) {
            symbol = pool.getSymbol(
                    (char) random.nextInt(97, 101), FontStyle.get(random.nextInt(FontStyle.values().length)).name(),
                    random.nextInt(12, 19), FontColor.get(random.nextInt(FontColor.values().length)).name());
            symbol.draw();
        }
        System.out.println("Промальовано " + len + " символів");
        System.out.println("Створено " + pool.getSizeCache());
    }

    private enum FontStyle {
        ARIAL,
        TIMES_NEW_ROMAN,
        CONSOLAS,
        COURIER;

        static FontStyle get(int n) {
            return switch(n) {
                case 0 -> ARIAL;
                case 1 -> TIMES_NEW_ROMAN;
                case 2 -> CONSOLAS;
                case 3 -> COURIER;
                default -> throw new IllegalStateException("Unexpected value: " + n);
            };
        }
    }

    private enum FontColor {
        BLACK,
        RED,
        GREEN,
        BLUE;

        static FontColor get(int n) {
            return switch(n) {
                case 0 -> BLACK;
                case 1 -> RED;
                case 2 -> GREEN;
                case 3 -> BLUE;
                default -> throw new IllegalStateException("Unexpected value: " + n);
            };
        }
    }
}
