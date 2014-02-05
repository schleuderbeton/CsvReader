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
        //validateStockMainWarehouse("3157_STOCK_MAIN_WHS_20140204.csv", "stockMainWarehouseList");
        //validateStockShops("3157_STOCK_SHOPS_20140204.csv", "stockShopsList");
        //validateStockValue("3157_STOCK_VALUE_20140204.csv", "stockValueList");
        //validateStockCarboot("3157_STOCK_CARBOOT_20140204.csv", "stockValueList");
        //validateGld("3157_GLD_20140204.csv", "gldList");
        //validateConsumption("3157_CONSUMPTION_20140204.csv", "consumtionList");
        //validateCustomerGeneral("3157_General_20140121.csv", "customerGeneralList");
        validateCustomerSknvk("3157_SKNVK_20140121.csv", "customerSknvksList");

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
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<CustomerSknvk>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static List<StockMainWarehouse> runSmooksTransformStockMainWarehouse(StockMainWarehouse dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<StockMainWarehouse>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static List<StockShops> runSmooksTransformStockShops(StockShops dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<StockShops>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static List<StockValue> runSmooksTransformStockValue(StockValue dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<StockValue>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static List<StockCarboot> runSmooksTransformStockCarboot(StockCarboot dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<StockCarboot>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static List<Gld> runSmooksTransformGld(Gld dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<Gld>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static List<Consumption> runSmooksTransformConsumption(Consumption dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<Consumption>) javaResult.getBean(beanId);
        } finally {
            smooks.close();
        }
    }

    private static List<CustomerGeneral> runSmooksTransformCustomerGeneral(CustomerGeneral dataClass, String beanId, String messageIn) throws IOException, SAXException, SmooksException {
        Smooks smooks = new Smooks();
        try {
            CSVRecordParserConfigurator csvrpc = new CSVRecordParserConfigurator(dataClass.getCsvFields());
            csvrpc.setSeparatorChar(dataClass.getSeparatorChar());
            Binding binding = new Binding(beanId, dataClass.getClass(), BindingType.LIST);
            smooks.setReaderConfig(csvrpc.setBinding(binding));
            // Configure the execution context to generate a report...
            ExecutionContext executionContext = smooks.createExecutionContext();
            //executionContext.setEventListener(new HtmlReportGenerator("target/report/report.html"));
            JavaResult javaResult = new JavaResult();
            smooks.filterSource(executionContext, new StringSource(messageIn), javaResult);
            return (List<CustomerGeneral>) javaResult.getBean(beanId);
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

    private static void validateCustomerSknvk(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            CustomerSknvk customerSknvk = new CustomerSknvk();
            if (csvStructureValid(file, CustomerSknvk.class.getSimpleName(), customerSknvk.getNofFields())) {

                List<CustomerSknvk> customerSknvks = runSmooksTransformCustomerSknvk(customerSknvk, beanID, readFileIntoString(file));
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
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String percentage(int total, int invalid) {
        int percentage = (total - invalid) / total * 100;
        return String.valueOf(percentage).concat(" %");
    }

    private static void validateStockMainWarehouse(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            StockMainWarehouse data2validate = new StockMainWarehouse();
            if (csvStructureValid(file, StockMainWarehouse.class.getSimpleName(), data2validate.getNofFields())) {

                List<StockMainWarehouse> records = runSmooksTransformStockMainWarehouse(data2validate, beanID, readFileIntoString(file));
                if (records.size() > 0) {
                    int totalRecords = records.size(), invalidRecords = 0;
                    for (StockMainWarehouse record : records) {
                        if (record.isValid()) {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " valid: " + record.toCsvString());
                        } else {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " INVALID: " + record.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, data2validate.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validateStockShops(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            StockShops data2validate = new StockShops();
            if (csvStructureValid(file, StockShops.class.getSimpleName(), data2validate.getNofFields())) {
                List<StockShops> records = runSmooksTransformStockShops(data2validate, beanID, readFileIntoString(file));
                if (records.size() > 0) {
                    int totalRecords = records.size(), invalidRecords = 0;
                    for (StockShops record : records) {
                        if (record.isValid()) {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " valid: " + record.toCsvString());
                        } else {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " INVALID: " + record.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, data2validate.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validateStockValue(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            StockValue data2validate = new StockValue();
            if (csvStructureValid(file, StockValue.class.getSimpleName(), data2validate.getNofFields())) {
                List<StockValue> records = runSmooksTransformStockValue(data2validate, beanID, readFileIntoString(file));
                if (records.size() > 0) {
                    int totalRecords = records.size(), invalidRecords = 0;
                    for (StockValue record : records) {
                        if (record.isValid()) {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " valid: " + record.toCsvString());
                        } else {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " INVALID: " + record.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, data2validate.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validateStockCarboot(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            StockCarboot data2validate = new StockCarboot();
            if (csvStructureValid(file, StockCarboot.class.getSimpleName(), data2validate.getNofFields())) {
                List<StockCarboot> records = runSmooksTransformStockCarboot(data2validate, beanID, readFileIntoString(file));
                if (records.size() > 0) {
                    int totalRecords = records.size(), invalidRecords = 0;
                    for (StockCarboot record : records) {
                        if (record.isValid()) {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " valid: " + record.toCsvString());
                        } else {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " INVALID: " + record.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, data2validate.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validateGld(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            Gld data2validate = new Gld();
            if (csvStructureValid(file, Gld.class.getSimpleName(), data2validate.getNofFields())) {
                List<Gld> records = runSmooksTransformGld(data2validate, beanID, readFileIntoString(file));
                if (records.size() > 0) {
                    int totalRecords = records.size(), invalidRecords = 0;
                    for (Gld record : records) {
                        if (record.isValid()) {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " valid: " + record.toCsvString());
                        } else {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " INVALID: " + record.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, data2validate.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validateConsumption(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            Consumption data2validate = new Consumption();
            if (csvStructureValid(file, Consumption.class.getSimpleName(), data2validate.getNofFields())) {
                List<Consumption> records = runSmooksTransformConsumption(data2validate, beanID, readFileIntoString(file));
                if (records.size() > 0) {
                    int totalRecords = records.size(), invalidRecords = 0;
                    for (Consumption record : records) {
                        if (record.isValid()) {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " valid: " + record.toCsvString());
                        } else {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " INVALID: " + record.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, data2validate.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validateCustomerGeneral(String file, String beanID) throws SmooksException, IOException, SAXException {
        try {
            CustomerGeneral data2validate = new CustomerGeneral();
            if (csvStructureValid(file, CustomerGeneral.class.getSimpleName(), data2validate.getNofFields())) {
                List<CustomerGeneral> records = runSmooksTransformCustomerGeneral(data2validate, beanID, readFileIntoString(file));
                if (records.size() > 0) {
                    int totalRecords = records.size(), invalidRecords = 0;
                    for (CustomerGeneral record : records) {
                        if (record.isValid()) {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " valid: " + record.toCsvString());
                        } else {
                            LOG.log(Level.INFO, record.getClass().getSimpleName() + " INVALID: " + record.toCsvString());
                            invalidRecords++;
                        }
                    }
                    LOG.log(Level.INFO, data2validate.getClass().getSimpleName() + ": " + String.valueOf(totalRecords - invalidRecords) + " of "
                            + String.valueOf(totalRecords) + " records valid [" + percentage(totalRecords, invalidRecords) + "]");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
