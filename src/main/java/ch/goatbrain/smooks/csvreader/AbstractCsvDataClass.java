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

    protected char separatorChar = '|';
    protected String csvFields;

    public char getSeparatorChar() {
        return separatorChar;
    }

    public void setSeparatorChar(char separatorChar) {
        this.separatorChar = separatorChar;
    }

    public String getCsvFields() {
        return csvFields;
    }

    public void setCsvFields(String csvFields) {
        this.csvFields = csvFields;
    }

    public int getNofFields() {
        return StringUtils.countMatches(csvFields, String.valueOf(",")) + 1;
    }
}
