package behavioral.strategy.model;

public class NoTaxStrategy implements TaxStrategy {
    @Override
    public double calculate(double sum) {
        return 0;
    }
}
