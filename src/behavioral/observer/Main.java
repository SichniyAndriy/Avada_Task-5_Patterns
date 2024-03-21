package behavioral.observer;

import behavioral.observer.model.Admin;
import behavioral.observer.model.Server;
import java.util.Locale;
import net.datafaker.Faker;

public class Main {
    public static final Faker faker = new Faker(Locale.getDefault());

    public static void main(String[] args) {
        Server server1 = new Server(faker.computer().linux());
        Server server2 = new Server(faker.computer().linux());
        Server server3 = new Server(faker.computer().linux());

        Admin admin1 = new Admin(faker.name().firstName() + " " + faker.name().lastName());
        Admin admin2 = new Admin(faker.name().firstName() + " " + faker.name().lastName());

        server1.add(admin1);
        server1.add(admin2);
        server2.add(admin1);
        server2.add(admin2);
        server3.add(admin1);
        server3.add(admin2);

        server1.add(admin1);
        server3.add(admin2);

        for (int i = 0; i < 3; i++) {
            server1.changeState();
            System.out.println();
            server2.changeState();
            System.out.println();
            server3.changeState();
            System.out.println();
        }

        server3.remove(admin2);
        server2.remove(admin1);

        for (int i = 0; i < 3; i++) {
            server1.changeState();
            System.out.println();
            server2.changeState();
            System.out.println();
            server3.changeState();
            System.out.println();
        }
    }
}
