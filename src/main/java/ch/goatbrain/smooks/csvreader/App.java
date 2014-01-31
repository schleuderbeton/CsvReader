package ch.goatbrain.smooks.csvreader;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
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

    public static void main(String[] args) {
        LOG.info("CSVReader test ...");
        try {
            //basicCsvValidation("3157_General_20140121_small.csv");
            basicCsvValidation("3157_General_20140121.csv");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }



    }

    private static void basicCsvValidation(String csvFile) throws FileNotFoundException {

        List<String> lines = readFileUsingScanner(csvFile);

        int lineCounter = 1, nofFields = 1, invalidRecords = 0;
        for (String line : lines) {
            nofFields = StringUtils.countMatches(line, "|");
            if (CustomerGeneral.getNofFields() != nofFields) {
                LOG.log(Level.SEVERE, "Line " + String.valueOf(lineCounter) + " - " + nofFields + " fields -> expected=" + CustomerGeneral.getNofFields());
                //LOG.log(Level.SEVERE, line);
                invalidRecords++;
            }
            lineCounter++;
            nofFields = 1;
        }

        LOG.log(Level.INFO, "#############################################################");
        LOG.log(Level.INFO, "Total records:\t\t\t".concat(String.valueOf(lines.size())).concat(" lines"));
        LOG.log(Level.INFO, "Total invalid records:\t\t".concat(String.valueOf(invalidRecords)).concat(" lines"));
        LOG.log(Level.INFO, "Total valid records:\t\t".concat(String.valueOf(lines.size() - invalidRecords)).concat(" lines"));



//        String messageIn = readInputMessage(csvFile);
//
//
//
//
//        int count = StringUtils.countMatches(messageIn, "|");
//        int count2 = StringUtils.countMatches(messageIn, "\n");
//
//        LOG.log(Level.OFF, "====nof lines=" + String.valueOf(count2));
//        LOG.log(Level.OFF, "====nof fields=" + String.valueOf(count) + 1);

        //mapCustomerGeneralDataCsv2Java(messageIn);
    }

    private static List<CustomerGeneral> runSmooksTransformCustomerGeneral(String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(CustomerGeneral.getCsvFields());
            csvrpc.setSeparatorChar('|');
            Binding binding = new Binding("customerGeneralList", CustomerGeneral.class, BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));

            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<CustomerGeneral>) javaResult.getBean("customerGeneralList");
        } finally {
            smooks.close();
        }
    }

    private static List runSmooksTransformCustomer(String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator("firstName,lastName,city");
            csvrpc.setSeparatorChar('|');
            Binding binding = new Binding("customerList", Customer.class, BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));

            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);

            return (List) javaResult.getBean("customerList");
        } finally {
            smooks.close();
        }
    }

    private static String readInputMessage(String file) {
        try {
            return StreamUtils.readStreamAsString(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
            return "<no-message/>";
        }
    }

    public static List<String> readFileUsingScanner(String filename) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        Scanner fileScanner = null;
        fileScanner = new Scanner(new File(filename));
        while (fileScanner.hasNextLine()) {
            lines.add(fileScanner.nextLine());
        }
        return lines;
    }

    public static List<String> readFileUsingGuava(String filename) throws IOException {
        String text = null;
        text = Files.toString(new File(filename), Charsets.UTF_8);
        LOG.log(Level.FINEST, text.trim());
        List<String> list = Lists.newArrayList();
        for (String s : text.split("\\n")) {
            list.add(String.valueOf(s));
        }
        return list;
    }

    private static void simlpeTest() {
        String messageIn = readInputMessage("wambo.csv");
        LOG.log(Level.OFF, "---IN----------------------");
        LOG.log(Level.OFF, messageIn);
        LOG.log(Level.OFF, "---------------------------");
        try {
            List messageOut = runSmooksTransformCustomer(messageIn);

            LOG.log(Level.OFF, "---OUT---------------------");
            for (Object record : messageOut) {
                if (record instanceof Customer) {
                    LOG.log(Level.OFF, "----------------------------------------CSV->" + ((Customer) record).toCsvString());
                }
                LOG.info(record.toString());
            }
            LOG.log(Level.OFF, "---------------------------");

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SmooksException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void mapCustomerGeneralDataCsv2Java(String messageIn) {
        LOG.log(Level.OFF, "---IN----------------------");
        LOG.log(Level.OFF, messageIn);
        LOG.log(Level.OFF, "---------------------------");

        try {
            List<CustomerGeneral> messageOut = runSmooksTransformCustomerGeneral(messageIn);

            LOG.log(Level.OFF, "---OUT---------------------");
            int i = 0;
            for (CustomerGeneral customerGeneralData : messageOut) {
                i++;
            }
            LOG.log(Level.OFF, "======> " + i + "records");
            LOG.log(Level.OFF, "---------------------------");

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SmooksException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
