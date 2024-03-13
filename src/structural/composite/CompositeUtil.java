package structural.composite;

import java.math.BigDecimal;
import java.util.Locale;
import net.datafaker.Faker;
import structural.composite.model.MenuItem;
import structural.composite.model.MenuList;

public class CompositeUtil {
    private static final Faker faker = new Faker(Locale.getDefault());

    public static Faker getFaker() {
        return faker;
    }

    public static MenuList getFoods() {
        MenuList foodMenu = new MenuList("Їжа");
        int len = faker.random().nextInt(10, 20);
        for (int i = 0; i < len; ++i) {
            foodMenu.add(new MenuItem(
                    faker.food().dish(), BigDecimal.valueOf(faker.random().nextDouble(100., 300.))
            ));
        }
        return foodMenu;
    }


    public static MenuList getBeerMenu() {
        MenuList beerMenu = new MenuList("Пиво");
        int len = faker.random().nextInt(10, 20);
        for (int i = 0; i < len; i++) {
            beerMenu.add(new MenuItem(
                    faker.beer().name(), BigDecimal.valueOf(faker.random().nextDouble(30., 90.))
            ));
        }
        return beerMenu;
    }

    public static MenuList getDesserts() {
        MenuList dessertMenu = new MenuList("Десерти");
        int len = faker.random().nextInt(10, 20);
        for (int i = 0; i < len; i++) {
            dessertMenu.add(new MenuItem(
                    faker.dessert().flavor(), BigDecimal.valueOf(faker.random().nextDouble(75., 150.))
            ));
        }
        return dessertMenu;
    }
}
