package behavioral.strategy;

import behavioral.strategy.model.BasicTaxStrategy;
import behavioral.strategy.model.LuxTaxStrategy;
import behavioral.strategy.model.NoTaxStrategy;
import behavioral.strategy.model.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.setStrategy(new BasicTaxStrategy());
        shop.printCheck(1023.36);

        shop.setStrategy(new LuxTaxStrategy());
        shop.printCheck(3201.35);

        shop.setStrategy(new NoTaxStrategy());
        shop.printCheck(3631.35);
    }
}
