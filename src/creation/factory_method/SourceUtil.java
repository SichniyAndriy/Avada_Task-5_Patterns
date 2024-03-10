package creation.factory_method;

import net.datafaker.Faker;

public class SourceUtil {
    public String getText(Faker faker) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = faker.random().nextInt(10, 20);
        for (int i = 0; i < len; ++i) {
            stringBuilder.append(faker.azure().subscriptionId()).append(", ");
            stringBuilder.append(faker.azure().cosmosDBDatabase()).append(", ");
            stringBuilder.append(faker.azure().containerApps()).append(", ");
            stringBuilder.append(faker.azure().serviceBus()).append(", ");
            stringBuilder.append(faker.azure().serviceBusTopic()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
