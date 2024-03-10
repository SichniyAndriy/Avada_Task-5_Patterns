package creation.factory_method.model;

import java.time.LocalDateTime;

public class TxtReport extends AbstractReport {
    public TxtReport(LocalDateTime creationTime, String text) {
        super(creationTime, text);
    }
}
