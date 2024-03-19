package behavioral.interpreter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstname;
    private String lastName;
    private Integer age;
    private String city;
}
