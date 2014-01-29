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

        String messageIn = readInputMessage();
        LOG.log(Level.OFF, "---IN----------------------");
        LOG.log(Level.OFF, messageIn);
        LOG.log(Level.OFF, "---------------------------");
        try {
            List messageOut = runSmooksTransform(messageIn);

            LOG.log(Level.OFF, "---OUT---------------------");
            for (Object record : messageOut) {
                if(record instanceof Customer){
                    LOG.log(Level.OFF, "----------------------------------------CSV->"+((Customer) record).toCsvString());
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

    private static List runSmooksTransform(String messageIn) throws IOException, SAXException, SmooksException {
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

    private static String readInputMessage() {
        try {
            return StreamUtils.readStreamAsString(new FileInputStream("wambo.csv"));
        } catch (IOException e) {
            e.printStackTrace();
            return "<no-message/>";
        }
    }

    public static void readFileUsingScanner(String filename) throws FileNotFoundException {
        List<Integer> integers = new ArrayList<Integer>();
        Scanner fileScanner = null;
        fileScanner = new Scanner(new File(filename));
        while (fileScanner.hasNextInt()) {
            integers.add(fileScanner.nextInt());
        }
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

}
