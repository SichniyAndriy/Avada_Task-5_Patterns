package behavioral.interpreter.model;

import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import net.datafaker.Faker;

public class Context {
    private static Integer val = 0;
    private final SortedMap<Integer, Person> database = new TreeMap<>();
    private final static Faker FAKER = new Faker(Locale.getDefault());

    public String create() {
        return create(1);
    }

    public String create(Integer n) {
        for (int i = 0; i < n; i++) {
            database.put(++val, generateNewPerson());
        }
        return "Створено " + n + " записів";
    }

    public String create(Person person) {
        database.put(++val, person);
        return "Створено запис";
    }

    public Person read(Integer n) {
        return database.get(n);
    }

    public Map<Integer, Person> read(Integer from, Integer to) {
        return database.subMap(from, to);
    }

    public String delete(Integer n) {
        Person person = database.get(n);
        if (person != null) {
            return person + " видалено";
        }
        return "No result";
    }

    public String delete(Integer from, Integer to) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = from; i < to; ++i) {
            String line = delete(i);
            if (!line.equalsIgnoreCase("No result")) {
                stringBuilder.append(line).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public Person generateNewPerson() {
        Person person = new Person();
        person.setFirstname(FAKER.name().firstName());
        person.setLastName(FAKER.name().lastName());
        person.setAge(FAKER.random().nextInt(15, 55));
        person.setCity(FAKER.address().city());
        return person;
    }
}
