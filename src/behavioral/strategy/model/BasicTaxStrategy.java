package behavioral.strategy.model;

public class BasicTaxStrategy implements TaxStrategy{
    @Override
    public double calculate(double sum) {
        return sum * .1;
    }
}
