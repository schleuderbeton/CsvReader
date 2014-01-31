/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

import org.apache.commons.lang.StringUtils;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 30.01.2014 13:47:10
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public abstract class AbstractCsvDataClass {

    protected static char separatorChar = '|';
    private static String csvFields;

    public static char getSeparatorChar() {
        return separatorChar;
    }

    public static void setSeparatorChar(char separatorChar) {
        AbstractCsvDataClass.separatorChar = separatorChar;
    }

    public static String getCsvFields() {
        return csvFields;
    }

    public static void setCsvFields(String csvFields) {
        AbstractCsvDataClass.csvFields = csvFields;
    }

    public static int getNofFields() {
        return StringUtils.countMatches(csvFields, String.valueOf(",")) + 1;
    }
}
