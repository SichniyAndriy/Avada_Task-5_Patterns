package creation.singletone;

import creation.singletone.model.User;
import java.util.Locale;
import net.datafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker(Locale.getDefault());
        User user1 = new User(faker.name().fullName());
        User user2 = new User(faker.name().fullName());
        User user3 = new User(faker.name().fullName());
        User user4 = new User(faker.name().fullName());

        System.out.println(user1.use(SingleUniqueTool.getINSTANCE()).getResult());
        System.out.println(user2.use(SingleUniqueTool.getINSTANCE()).getResult());
        System.out.println(user3.use(SingleUniqueTool.getINSTANCE()).getResult());
        System.out.println(user4.use(SingleUniqueTool.getINSTANCE()).getResult());
    }
}
