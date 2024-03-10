package creation.factory_method;

import creation.factory_method.model.Report;
import creation.factory_method.service.CsvReportGenerator;
import creation.factory_method.service.PdfReportGenerator;
import creation.factory_method.service.ReportGenerator;
import creation.factory_method.service.TxtReportGenerator;
import java.util.Locale;
import net.datafaker.Faker;

public class Main {
    private static final Faker faker = new Faker(Locale.getDefault());

    public static void main(String[] args) {
        SourceUtil source = new SourceUtil();
        ReportGenerator csvReportGenerator = new CsvReportGenerator();
        ReportGenerator pdfReportGenerator = new PdfReportGenerator();
        ReportGenerator txtReportGenerator = new TxtReportGenerator();

        Report report;
        //CSV
        report = csvReportGenerator.generate(source.getText(faker));
        report.read();
        report = csvReportGenerator.generate(null);
        report.read();
        //PDF
        report = pdfReportGenerator.generate(source.getText(faker));
        report.read();
        report = pdfReportGenerator.generate("");
        report.read();
        //TXT
        report = txtReportGenerator.generate(source.getText(faker));
        report.read();
        report = txtReportGenerator.generate("     ");
        report.read();
    }
}
