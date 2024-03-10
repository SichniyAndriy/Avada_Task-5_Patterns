package creation.factory_method.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractReport implements Report {
    private LocalDateTime creationTime;
    private String text;

    @Override
    public void read() {
        System.out.println(text);
    }
}
