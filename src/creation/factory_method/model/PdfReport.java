package creation.factory_method.model;

import java.time.LocalDateTime;

public class PdfReport extends AbstractReport {
    public PdfReport(LocalDateTime creationTime, String text) {
        super(creationTime, text);
    }
}
