package creation.factory_method.service;

import creation.factory_method.model.Report;

public interface ReportGenerator {
    boolean check(String text);

    Report generate(String text);

}
