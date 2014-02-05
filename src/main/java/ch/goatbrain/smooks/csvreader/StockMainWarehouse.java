/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 31.01.2014 09:24:14
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class StockMainWarehouse extends AbstractCsvDataClass {

    private String materialNumber;
    private String valuationType;
    private String storageUnitType;
    private String stock;
    private String warehouse;
    private String storageLocation;
    private String sapWarehouseNr;
    private String storageType;
    private String storageSection;
    private String storageBin;
    private String lastGoodsEntry;
    private String vfdat;
    private String batchNumber;
    private String stockQualifier;
    private String specialStockSign;
    private String supplierNumber;

    public StockMainWarehouse() {
        setCsvFields("materialNumber,valuationType,storageUnitType,stock,warehouse,storageLocation,sapWarehouseNr,storageType,storageSection,storageBin,lastGoodsEntry,vfdat,batchNumber,stockQualifier,specialStockSign,supplierNumber");
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getValuationType() {
        return valuationType;
    }

    public void setValuationType(String valuationType) {
        this.valuationType = valuationType;
    }

    public String getStorageUnitType() {
        return storageUnitType;
    }

    public void setStorageUnitType(String storageUnitType) {
        this.storageUnitType = storageUnitType;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getSapWarehouseNr() {
        return sapWarehouseNr;
    }

    public void setSapWarehouseNr(String sapWarehouseNr) {
        this.sapWarehouseNr = sapWarehouseNr;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getStorageSection() {
        return storageSection;
    }

    public void setStorageSection(String storageSection) {
        this.storageSection = storageSection;
    }

    public String getStorageBin() {
        return storageBin;
    }

    public void setStorageBin(String storageBin) {
        this.storageBin = storageBin;
    }

    public String getLastGoodsEntry() {
        return lastGoodsEntry;
    }

    public void setLastGoodsEntry(String lastGoodsEntry) {
        this.lastGoodsEntry = lastGoodsEntry;
    }

    public String getVfdat() {
        return vfdat;
    }

    public void setVfdat(String vfdat) {
        this.vfdat = vfdat;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getStockQualifier() {
        return stockQualifier;
    }

    public void setStockQualifier(String stockQualifier) {
        this.stockQualifier = stockQualifier;
    }

    public String getSpecialStockSign() {
        return specialStockSign;
    }

    public void setSpecialStockSign(String specialStockSign) {
        this.specialStockSign = specialStockSign;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String toCsvString() {
        return materialNumber + separatorChar + valuationType + separatorChar + storageUnitType + separatorChar + stock + separatorChar + warehouse + separatorChar + storageLocation + separatorChar + sapWarehouseNr + separatorChar + storageType + separatorChar + storageSection + separatorChar + storageBin + separatorChar + lastGoodsEntry + separatorChar + vfdat + separatorChar + batchNumber + separatorChar + stockQualifier + separatorChar + specialStockSign + separatorChar + supplierNumber;
    }

    @Override
    public String toString() {
        return "StockMainWarehouse{" + "materialNumber=" + materialNumber + ", valuationType=" + valuationType + ", storageUnitType=" + storageUnitType + ", stock=" + stock + ", warehouse=" + warehouse + ", storageLocation=" + storageLocation + ", sapWarehouseNr=" + sapWarehouseNr + ", storageType=" + storageType + ", storageSection=" + storageSection + ", storageBin=" + storageBin + ", lastGoodsEntry=" + lastGoodsEntry + ", vfdat=" + vfdat + ", batchNumber=" + batchNumber + ", stockQualifier=" + stockQualifier + ", specialStockSign=" + specialStockSign + ", supplierNumber=" + supplierNumber + '}';
    }

    protected boolean mandatoryFieldsAvailable(boolean recordIsValid) {
        if (fieldHasContent(materialNumber, "materialNumber")
                && fieldHasContent(valuationType, "valuationType")
                && fieldHasContent(stock, "stock")
                && fieldHasContent(warehouse, "warehouse")
                && fieldHasContent(storageLocation, "storageLocation")
                && fieldHasContent(sapWarehouseNr, "sapWarehouseNr")
                && fieldHasContent(storageType, "storageType")
                && fieldHasContent(storageSection, "storageSection")
                && fieldHasContent(storageBin, "storageBin")
                && fieldHasContent(lastGoodsEntry, "lastGoodsEntry")
                && fieldHasContent(batchNumber, "batchNumber")) {
            recordIsValid = true;
        }
        return recordIsValid;
    }
}
