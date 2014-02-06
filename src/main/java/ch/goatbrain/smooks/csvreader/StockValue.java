/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 31.01.2014 10:10:15
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class StockValue extends AbstractCsvDataClass {

    public StockValue() {
        setCsvFields("article,warehouse,stock,stockUnit,stockType,gld,priceUnit,currency");
    }
    private String article;
    private String warehouse;
    private String stock;
    private String stockUnit;
    private String stockType;
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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
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
        return article + separatorChar + warehouse + separatorChar + stock + separatorChar + stockUnit + separatorChar + stockType + separatorChar + gld + separatorChar + priceUnit + separatorChar + currency;
    }

    @Override
    public String toString() {
        return "StockValue{" + "article=" + article + ", warehouse=" + warehouse + ", stock=" + stock + ", stockUnit=" + stockUnit + ", stockType=" + stockType + ", gld=" + gld + ", priceUnit=" + priceUnit + ", currency=" + currency + '}';
    }

    protected boolean mandatoryFieldsAvailable(boolean recordIsValid) {
        if (fieldHasContent(
                article, "article")
                && fieldHasContent(warehouse, "warehouse")
                && fieldHasContent(stock, "stock")
                && fieldHasContent(stockUnit, "stockUnit")
                && fieldHasContent(stockType, "stockType")
                && fieldHasContent(gld, "gld")
                && fieldHasContent(priceUnit, "priceUnit")
                && fieldHasContent(currency, "currency")) {
            recordIsValid = true;
        }
        return recordIsValid;
    }

    @Override
    protected boolean fieldContentIsValid(boolean recordIsValid) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }
}
