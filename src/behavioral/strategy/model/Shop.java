package behavioral.strategy.model;

import java.text.NumberFormat;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Shop {
    private TaxStrategy strategy;

    public void printCheck(double sum) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Покупка на суму " + numberFormat.format(sum));
        double x = strategy.calculate(sum);
        System.out.println("Податок: " + numberFormat.format(x));
        System.out.println("Всього: " + numberFormat.format(sum + x));
        System.out.println();
    }
}
