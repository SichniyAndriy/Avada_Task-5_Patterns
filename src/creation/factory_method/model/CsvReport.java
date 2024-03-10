package creation.factory_method.model;

import java.time.LocalDateTime;

public class CsvReport extends AbstractReport {
    public CsvReport(LocalDateTime creationTime, String text) {
        super(creationTime, text);
    }
}
