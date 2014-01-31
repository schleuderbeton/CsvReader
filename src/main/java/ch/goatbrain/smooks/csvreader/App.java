package ch.goatbrain.smooks.csvreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.StringUtils;
import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.csv.CSVRecordParserConfigurator;
import org.milyn.event.report.HtmlReportGenerator;
import org.milyn.flatfile.Binding;
import org.milyn.flatfile.BindingType;
import org.milyn.io.StreamUtils;
import org.milyn.payload.JavaResult;
import org.milyn.payload.StringSource;
import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException, SAXException {
        LOG.info("CSVReader test ...");
        String file = "3157_SKNVK_20140121_small.csv";
        try {
            CustomerSknvk customerSknvk = new CustomerSknvk();
            if (csvStructureValid(file, CustomerSknvk.class.getSimpleName(), customerSknvk.getNofFields())) {

                List<CustomerSknvk> customerSknvks = runSmooksTransformCustomerSknvk(customerSknvk, "customerSknvksList", readFileIntoString(file));
                if (customerSknvks.size() > 0) {
                    int totalRecords = customerSknvks.size(), invalidRecords = 0;
                    for (CustomerSknvk c : customerSknvks) {
                        if (c.isValid()) {
                            LOG.log(Level.INFO, c.getClass().getSimpleName() + " valid: " + c.toCsvString());
                        } else {
                            LOG.log(Level.INFO, c.getClass().getSimpleName() + " INVALID: " + c.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, customerSknvk.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + String.valueOf(totalRecords) + " %]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    private static boolean csvStructureValid(String csvFile, String dataClass, int nofFieldsReference) throws FileNotFoundException {
        boolean structureValid = false;
        List<String> lines = readFileIntoStringList(csvFile);

        int lineCounter = 1, nofFields = 1, invalidRecords = 0;
        for (String line : lines) {
            nofFields = StringUtils.countMatches(line, "|") + 1;
            if (nofFieldsReference != nofFields) {
                // error case ....
                LOG.log(Level.SEVERE, dataClass + ": Line " + String.valueOf(lineCounter) + " - " + nofFields + " fields -> expected=" + nofFieldsReference);
                //LOG.log(Level.SEVERE, line);
                invalidRecords++;
            }
            lineCounter++;
            nofFields = 1;
        }

        LOG.log(Level.INFO, "\n\n########################## csv structure test###################################");
        if (invalidRecords < 1) {
            structureValid = true;
            LOG.log(Level.INFO, dataClass + ": CSV structure valid:\t\t".concat(String.valueOf(lines.size())).concat(" records"));
        } else {
            LOG.log(Level.INFO, dataClass + ": Total records:\t\t\t".concat(String.valueOf(lines.size())).concat(" lines"));
            LOG.log(Level.INFO, dataClass + ": Total invalid records:\t\t".concat(String.valueOf(invalidRecords)).concat(" lines"));
            LOG.log(Level.INFO, dataClass + ": Total valid records:\t\t".concat(String.valueOf(lines.size() - invalidRecords)).concat(" lines"));
        }
        return structureValid;
    }

    private static List<CustomerSknvk> runSmooksTransformCustomerSknvk(CustomerSknvk dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<CustomerSknvk>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static String readFileIntoString(String file) {
        try {
            return StreamUtils.readStreamAsString(new FileInputStream(file));
        } catch (IOException e) {
            LOG.log(Level.SEVERE, e.getMessage());
            return "<no-message/>";
        }
    }

    public static List<String> readFileIntoStringList(String filename) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        Scanner fileScanner = null;
        fileScanner = new Scanner(new File(filename));
        while (fileScanner.hasNextLine()) {
            lines.add(fileScanner.nextLine());
        }
        return lines;
    }
}
