package creation.factory_method.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractReport implements Report {
    private LocalDateTime creationTime;
    private String text;

    @Override
    public void read() {
        System.out.println(
                creationTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + ": " + text
        );
    }
}
