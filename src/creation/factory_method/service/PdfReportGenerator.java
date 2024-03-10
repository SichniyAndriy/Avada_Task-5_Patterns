package creation.factory_method.service;

import creation.factory_method.model.ErrorReport;
import creation.factory_method.model.PdfReport;
import creation.factory_method.model.Report;
import java.time.LocalDateTime;

public class PdfReportGenerator extends AbstractReportGenerator{
    @Override
    public Report generate(String text) {
        LocalDateTime localDateTime = LocalDateTime.now();
        return check(text) ?
                new PdfReport(localDateTime, buffer) : new ErrorReport(localDateTime, ERROR_MESSAGE);
    }
}
