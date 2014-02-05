/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 31.01.2014 10:02:05
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class StockCarboot extends AbstractCsvDataClass {

    public StockCarboot() {
        setCsvFields("materialnumber,warehouse,stock,saleRepNr,fach");
    }
    private String materialnumber;
    private String warehouse;
    private String stock;
    private String saleRepNr;
    private String fach;

    public String getMaterialnumber() {
        return materialnumber;
    }

    public void setMaterialnumber(String materialnumber) {
        this.materialnumber = materialnumber;
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

    public String getSaleRepNr() {
        return saleRepNr;
    }

    public void setSaleRepNr(String saleRepNr) {
        this.saleRepNr = saleRepNr;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public String toCsvString() {
        return materialnumber + separatorChar + warehouse + separatorChar + stock + separatorChar + saleRepNr + separatorChar + fach;
    }

    @Override
    public String toString() {
        return "StocksCarboot{" + "materialnumber=" + materialnumber + ", warehouse=" + warehouse + ", stock=" + stock + ", saleRepNr=" + saleRepNr + ", fach=" + fach + '}';
    }

    protected boolean mandatoryFieldsAvailable(boolean recordIsValid) {
        if (fieldHasContent(
                materialnumber, "materialNumber")
                && fieldHasContent(warehouse, "warehouse")
                && fieldHasContent(stock, "stock")
                && fieldHasContent(saleRepNr, "saleRepNr")) {
            recordIsValid = true;
        }
        return recordIsValid;
    }
}
