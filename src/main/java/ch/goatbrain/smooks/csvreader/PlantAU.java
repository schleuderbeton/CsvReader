/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 11.02.2014 17:00:56
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class PlantAU extends AbstractCsvDataClass {

    private String product;
    private String materialNumber;
    private String plant;
    private String warehouseNumber;
    private String storageType;
    private String section;
    private String stockPlacement;
    private String storageBin;
    private String localAlpha;
    private String localMspa;
    private String maxQuantityOnBin;
    private String controlQuantity;
    private String piQuantity;
    private String um;
    private String plt;
    private String replenishment;
    private String batch;

    public PlantAU() {
        setCsvFields("product,materialNumber,plant,warehouseNumber,storageType,section,stockPlacement,storageBin,localAlpha,localMspa,maxQuantityOnBin,controlQuantity,piQuantity,um,plt,replenishment,batch");
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getStockPlacement() {
        return stockPlacement;
    }

    public void setStockPlacement(String stockPlacement) {
        this.stockPlacement = stockPlacement;
    }

    public String getStorageBin() {
        return storageBin;
    }

    public void setStorageBin(String storageBin) {
        this.storageBin = storageBin;
    }

    public String getLocalAlpha() {
        return localAlpha;
    }

    public void setLocalAlpha(String localAlpha) {
        this.localAlpha = localAlpha;
    }

    public String getLocalMspa() {
        return localMspa;
    }

    public void setLocalMspa(String localMspa) {
        this.localMspa = localMspa;
    }

    public String getMaxQuantityOnBin() {
        return maxQuantityOnBin;
    }

    public void setMaxQuantityOnBin(String maxQuantityOnBin) {
        this.maxQuantityOnBin = maxQuantityOnBin;
    }

    public String getControlQuantity() {
        return controlQuantity;
    }

    public void setControlQuantity(String controlQuantity) {
        this.controlQuantity = controlQuantity;
    }

    public String getPiQuantity() {
        return piQuantity;
    }

    public void setPiQuantity(String piQuantity) {
        this.piQuantity = piQuantity;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getPlt() {
        return plt;
    }

    public void setPlt(String plt) {
        this.plt = plt;
    }

    public String getReplenishment() {
        return replenishment;
    }

    public void setReplenishment(String replenishment) {
        this.replenishment = replenishment;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String toCsvString() {
        return product + separatorChar + materialNumber + separatorChar + plant + separatorChar + warehouseNumber + separatorChar + storageType + separatorChar + section + separatorChar + stockPlacement + separatorChar + storageBin + separatorChar + localAlpha + separatorChar + localMspa + separatorChar + maxQuantityOnBin + separatorChar + controlQuantity + separatorChar + piQuantity + separatorChar + um + separatorChar + plt + separatorChar + replenishment + separatorChar + batch;
    }

    @Override
    public String toString() {
        return "StockMainWarehouseAU{" + "product=" + product + ", materialNumber=" + materialNumber + ", plant=" + plant + ", warehouseNumber=" + warehouseNumber + ", storageType=" + storageType + ", section=" + section + ", stockPlacement=" + stockPlacement + ", storageBin=" + storageBin + ", localAlpha=" + localAlpha + ", localMspa=" + localMspa + ", maxQuantityOnBin=" + maxQuantityOnBin + ", controlQuantity=" + controlQuantity + ", piQuantity=" + piQuantity + ", um=" + um + ", plt=" + plt + ", replenishment=" + replenishment + ", batch=" + batch + '}';
    }

    @Override
    protected boolean mandatoryFieldsAvailable(boolean recordIsValid) {
        if (fieldHasContent(materialNumber, "materialNumber")
                && fieldHasContent(plant, "plant")
                && fieldHasContent(warehouseNumber, "warehouseNumber")
                && fieldHasContent(storageType, "storageType")
                && fieldHasContent(stockPlacement, "stockPlacement")
                && fieldHasContent(storageBin, "storageBin")
                && fieldHasContent(maxQuantityOnBin, "maxQuantityOnBin")
                && fieldHasContent(controlQuantity, "controlQuantity")
                && fieldHasContent(piQuantity, "piQuantity")
                && fieldHasContent(um, "um")
                && fieldHasContent(plt, "plt")) {
            recordIsValid = true;
        }
        return recordIsValid;
    }

    @Override
    protected boolean fieldContentIsValid(boolean recordIsValid) {
//        if(maxQuantityOnBin > 0){
//
//        }
        return true;
    }
}
