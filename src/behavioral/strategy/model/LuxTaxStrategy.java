package behavioral.strategy.model;

public class LuxTaxStrategy implements TaxStrategy {
    @Override
    public double calculate(double sum) {
        return sum * .2;
    }
}
