package creation.factory_method.service;

import creation.factory_method.model.Report;

public abstract class AbstractReportGenerator implements ReportGenerator {
    protected final String TYPE;
    protected final String ERROR_MESSAGE;
    {
        TYPE = this.getClass().getSimpleName().subSequence(0, 3).toString().toUpperCase();
        ERROR_MESSAGE = TYPE + " звіт пошкоджено\n";
    }
    protected String buffer;

    @Override
    public boolean check(String text) {
        if (text != null && !text.isBlank()) {
            int symbols = text.length();
            int lines = (int) text.lines().count();
            buffer =
                    "Звіт " + TYPE +
                    " містить " + symbols + " символів " + " в " + lines + " строках\n" + text;
            return true;
        }
        return false;
    }

    public abstract Report generate(String text);
}
