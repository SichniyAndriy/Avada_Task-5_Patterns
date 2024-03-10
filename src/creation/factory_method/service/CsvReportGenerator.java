package creation.factory_method.service;

import creation.factory_method.model.CsvReport;
import creation.factory_method.model.ErrorReport;
import creation.factory_method.model.Report;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CsvReportGenerator extends AbstractReportGenerator {
    @Override
    public Report generate(String text) {
        LocalDateTime localDateTime = LocalDateTime.now();
        return check(text) ?
                new CsvReport(localDateTime, buffer) : new ErrorReport(localDateTime, ERROR_MESSAGE);
    }
}
