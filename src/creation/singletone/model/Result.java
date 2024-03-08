package creation.singletone.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import net.datafaker.Faker;

@Getter
@NoArgsConstructor
public class Result {
    private final String result = new Faker().construction().materials();
}
