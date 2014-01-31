/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 31.01.2014 09:42:34
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class StockShops extends AbstractCsvDataClass {

    public StockShops() {
        setCsvFields("materialNumber,warehouse,stock,location");
    }
    private String materialNumber;
    private String warehouse;
    private String stock;
    private String location;

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toCsvString() {
        return materialNumber + separatorChar + warehouse + separatorChar + stock + separatorChar + location;
    }

    @Override
    public String toString() {
        return "StockShops{" + "materialNumber=" + materialNumber + ", warehouse=" + warehouse + ", stock=" + stock + ", location=" + location + '}';
    }
}
