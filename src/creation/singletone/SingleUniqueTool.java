package creation.singletone;

import net.datafaker.Faker;

public class SingleUniqueTool {
    private static final SingleUniqueTool INSTANCE;
    private final String name;

    static {
        Faker faker = new Faker();
        INSTANCE = new SingleUniqueTool(faker.construction().heavyEquipment());
    }

    private SingleUniqueTool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static SingleUniqueTool getINSTANCE() {
        return INSTANCE;
    }
}
