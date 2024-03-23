package behavioral.strategy;

import behavioral.strategy.model.BasicTaxStrategy;
import behavioral.strategy.model.LuxTaxStrategy;
import behavioral.strategy.model.NoTaxStrategy;
import behavioral.strategy.model.Shop;

/*
* Pattern Strategy lets define family of algorithms.
* Put each of them in stand-alone class and make this object
* interchangeably
*/
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
