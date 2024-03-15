package creation.singletone.model;

import lombok.Getter;
import net.datafaker.Faker;

@Getter
public class Result {
    private final String result = new Faker().construction().materials();
}
