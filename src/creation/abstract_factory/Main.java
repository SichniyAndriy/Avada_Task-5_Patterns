package creation.abstract_factory;

import creation.abstract_factory.service.SamsungFactory;
import creation.abstract_factory.service.SiemensFactory;
import creation.abstract_factory.service.WhirlpoolFactory;
import java.util.ArrayList;
import java.util.List;

/*
* Pattern Abstract factory provides interface for creation
* family of related or interdependent objects
*/
public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        Client samsungClient = new Client("Samsung", new SamsungFactory());
        Client siemensClient = new Client("Siemens", new SiemensFactory());
        Client whirlpoolClient = new Client("Whirlpool", new WhirlpoolFactory());

        clients.add(samsungClient);
        clients.add(siemensClient);
        clients.add(whirlpoolClient);
        clients.forEach(client -> {
            client.makePurchases();
            client.takeAllHome();
            client.testPurchases();
        });
    }
}
