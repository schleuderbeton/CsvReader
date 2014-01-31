/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

import static ch.goatbrain.smooks.csvreader.AbstractCsvDataClass.separatorChar;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 31.01.2014 10:18:53
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class Gld extends AbstractCsvDataClass {

    public Gld() {
        setCsvFields("article,warehouse,gld,priceUnit,currency");
    }
    private String article;
    private String warehouse;
    private String gld;
    private String priceUnit;
    private String currency;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getGld() {
        return gld;
    }

    public void setGld(String gld) {
        this.gld = gld;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toCsvString() {
        return article + separatorChar + warehouse + separatorChar + gld + separatorChar + priceUnit + separatorChar + currency;
    }

    @Override
    public String toString() {
        return "Gld{" + "article=" + article + ", warehouse=" + warehouse + ", gld=" + gld + ", priceUnit=" + priceUnit + ", currency=" + currency + '}';
    }
}
