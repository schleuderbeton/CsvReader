/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 12.02.2014 07:48:39
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class StorageBinsAU extends AbstractCsvDataClass {

    private String warehouseNumber;
    private String storageType;
    private String pickingArea;
    private String storageBin;
    private String storageSection;
    private String storageBinType;
    private String verifFld;
    private String sort1;
    private String sort2;
    private String maximumWeight;
    private String weightUnit;
    private String totalCapacity;

    public StorageBinsAU() {
        setCsvFields("warehouseNumber,storageType,pickingArea,storageBin,storageType,storageSection,storageBinType,verifFld,sort1,sort2,maximumWeight,weightUnit,totalCapacity");
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

    public String getPickingArea() {
        return pickingArea;
    }

    public void setPickingArea(String pickingArea) {
        this.pickingArea = pickingArea;
    }

    public String getStorageBin() {
        return storageBin;
    }

    public void setStorageBin(String storageBin) {
        this.storageBin = storageBin;
    }

    public String getStorageSection() {
        return storageSection;
    }

    public void setStorageSection(String storageSection) {
        this.storageSection = storageSection;
    }

    public String getStorageBinType() {
        return storageBinType;
    }

    public void setStorageBinType(String storageBinType) {
        this.storageBinType = storageBinType;
    }

    public String getVerifFld() {
        return verifFld;
    }

    public void setVerifFld(String verifFld) {
        this.verifFld = verifFld;
    }

    public String getSort1() {
        return sort1;
    }

    public void setSort1(String sort1) {
        this.sort1 = sort1;
    }

    public String getSort2() {
        return sort2;
    }

    public void setSort2(String sort2) {
        this.sort2 = sort2;
    }

    public String getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(String maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(String totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    @Override
    public String toString() {
        return "StorageBinsAU{" + "warehouseNumber=" + warehouseNumber + ", storageType=" + storageType + ", pickingArea=" + pickingArea + ", storageBin=" + storageBin + ", storageSection=" + storageSection + ", storageBinType=" + storageBinType + ", verifFld=" + verifFld + ", sort1=" + sort1 + ", sort2=" + sort2 + ", maximumWeight=" + maximumWeight + ", weightUnit=" + weightUnit + ", totalCapacity=" + totalCapacity + '}';
    }

    public String toCsvString() {
        return warehouseNumber + separatorChar + storageType + separatorChar + pickingArea + separatorChar + storageBin + separatorChar + storageType + separatorChar + storageSection + separatorChar + storageBinType + separatorChar + verifFld + separatorChar + sort1 + separatorChar + sort2 + separatorChar + maximumWeight + separatorChar + weightUnit + separatorChar + totalCapacity;
    }

    @Override
    protected boolean mandatoryFieldsAvailable(boolean recordIsValid) {
        if (fieldHasContent(warehouseNumber, "warehouseNumber")
                && fieldHasContent(storageType, "storageType")
                && fieldHasContent(pickingArea, "pickingArea")
                && fieldHasContent(storageBin, "storageBin")
                && fieldHasContent(storageType, "storageType")
                && fieldHasContent(storageSection, "storageSection")
                && fieldHasContent(storageBinType, "storageBinType")) {
            recordIsValid = true;
        }
        return recordIsValid;
    }

    @Override
    protected boolean fieldContentIsValid(boolean recordIsValid) {
        return true;
    }
}
