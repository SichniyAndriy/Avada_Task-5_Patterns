package creation.factory_method;

import creation.factory_method.model.Report;
import creation.factory_method.service.CsvReportGenerator;
import creation.factory_method.service.PdfReportGenerator;
import creation.factory_method.service.ReportGenerator;
import creation.factory_method.service.TxtReportGenerator;
import java.util.Locale;
import net.datafaker.Faker;

/*
* Pattern Factory method provides interface for object creation in super class,
* but also it allows creates other types in subclasses
*/
public class Main {
    private static final Faker faker = new Faker(Locale.getDefault());

    public static void main(String[] args) {
        ReportGenerator csvReportGenerator = new CsvReportGenerator();
        ReportGenerator pdfReportGenerator = new PdfReportGenerator();
        ReportGenerator txtReportGenerator = new TxtReportGenerator();

        Report report;
        //CSV
        report = csvReportGenerator.generate(getText());
        report.read();
        report = csvReportGenerator.generate(null);
        report.read();
        //PDF
        report = pdfReportGenerator.generate(getText());
        report.read();
        report = pdfReportGenerator.generate("");
        report.read();
        //TXT
        report = txtReportGenerator.generate(getText());
        report.read();
        report = txtReportGenerator.generate("     ");
        report.read();
    }

    private static String getText() {
        StringBuilder stringBuilder = new StringBuilder();
        int len = Main.faker.random().nextInt(10, 20);
        for (int i = 0; i < len; ++i) {
            stringBuilder.append(Main.faker.azure().subscriptionId()).append(", ");
            stringBuilder.append(Main.faker.azure().cosmosDBDatabase()).append(", ");
            stringBuilder.append(Main.faker.azure().containerApps()).append(", ");
            stringBuilder.append(Main.faker.azure().serviceBus()).append(", ");
            stringBuilder.append(Main.faker.azure().serviceBusTopic()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
