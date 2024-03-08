package creation.singletone.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.datafaker.Faker;

@Data
@NoArgsConstructor
public class Result {
    private String result = new Faker().construction().materials();
}
