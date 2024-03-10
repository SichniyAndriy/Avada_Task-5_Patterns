package creation.factory_method.service;

import creation.factory_method.model.ErrorReport;
import creation.factory_method.model.Report;
import creation.factory_method.model.TxtReport;
import java.time.LocalDateTime;

public class TxtReportGenerator extends AbstractReportGenerator{
    @Override
    public Report generate(String text) {
        LocalDateTime localDateTime = LocalDateTime.now();
        return check(text) ?
                new TxtReport(localDateTime, buffer) : new ErrorReport(localDateTime, ERROR_MESSAGE);
    }
}
