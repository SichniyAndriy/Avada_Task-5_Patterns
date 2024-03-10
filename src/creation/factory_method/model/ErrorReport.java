package creation.factory_method.model;

import java.time.LocalDateTime;

public class ErrorReport extends AbstractReport {
    public ErrorReport(LocalDateTime creationTime, String text) {
        super(creationTime, text);
    }
}
