/**
 * $HeadURL$
 */
package ch.goatbrain.smooks.csvreader;

/**
 * TODO
 *
 * @author Michael Buchli <michael.buchli@wuerth-itensis.com>
 * @copyright (c) 2007-2014, Wuerth ITensis AG
 * @created 12.02.2014 07:48:25
 *
 * @$Revision$
 *
 * @$LastChangedBy$
 * @$LastChangedDate$
 * @$Id$
 */
public class StockMainWarehouseAU extends AbstractCsvDataClass {

    private String warehouseNumber;
    private String requirementNumber;
    private String requirementType;
    private String groupRefNr;
    private String movementType;
    private String materialNumber;
    private String legacyMaterialNumber;
    private String plant;
    private String storageLocation;
    private String batchNumber;
    private String stockCategory;
    private String specialStockIndicator;
    private String specialStockNumber;
    private String alternativeUnitOfMeasureForStockkeepingUnit;
    private String storageUnitType;
    private String goodsRecipientShipToParty;
    private String destinationStorageType;
    private String destinationStorageSection;
    private String destinationStorageBin;
    private String requestedQuantityInAlternativeUnitOfMeasure;
    private String confirmationOfTransferOrderItemIndicator;
    private String CertificateNumber;
    private String dateOfGoodsReceipt;
    private String sourceStorageType;
    private String sourceStorageBin;
    private String shelfLifeExpirationOrBestBeforeDate;
    private String destinationStorageUnitNumber;

    public StockMainWarehouseAU() {
        setCsvFields("warehouseNumber,requirementNumber,requirementType,groupRefNr,movementType,materialNumber,legacyMaterialNumber,plant,storageLocation,batchNumber,stockCategory,specialStockIndicator,specialStockNumber,alternativeUnitOfMeasureForStockkeepingUnit,storageUnitType,goodsRecipientShipToParty,destinationStorageType,destinationStorageSection,destinationStorageBin,requestedQuantityInAlternativeUnitOfMeasure,confirmationOfTransferOrderItemIndicator,CertificateNumber,dateOfGoodsReceipt,sourceStorageType,sourceStorageBin,shelfLifeExpirationOrBestBeforeDate,destinationStorageUnitNumber");
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public String getRequirementNumber() {
        return requirementNumber;
    }

    public void setRequirementNumber(String requirementNumber) {
        this.requirementNumber = requirementNumber;
    }

    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public String getGroupRefNr() {
        return groupRefNr;
    }

    public void setGroupRefNr(String groupRefNr) {
        this.groupRefNr = groupRefNr;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getLegacyMaterialNumber() {
        return legacyMaterialNumber;
    }

    public void setLegacyMaterialNumber(String legacyMaterialNumber) {
        this.legacyMaterialNumber = legacyMaterialNumber;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getStockCategory() {
        return stockCategory;
    }

    public void setStockCategory(String stockCategory) {
        this.stockCategory = stockCategory;
    }

    public String getSpecialStockIndicator() {
        return specialStockIndicator;
    }

    public void setSpecialStockIndicator(String specialStockIndicator) {
        this.specialStockIndicator = specialStockIndicator;
    }

    public String getSpecialStockNumber() {
        return specialStockNumber;
    }

    public void setSpecialStockNumber(String specialStockNumber) {
        this.specialStockNumber = specialStockNumber;
    }

    public String getAlternativeUnitOfMeasureForStockkeepingUnit() {
        return alternativeUnitOfMeasureForStockkeepingUnit;
    }

    public void setAlternativeUnitOfMeasureForStockkeepingUnit(String alternativeUnitOfMeasureForStockkeepingUnit) {
        this.alternativeUnitOfMeasureForStockkeepingUnit = alternativeUnitOfMeasureForStockkeepingUnit;
    }

    public String getStorageUnitType() {
        return storageUnitType;
    }

    public void setStorageUnitType(String storageUnitType) {
        this.storageUnitType = storageUnitType;
    }

    public String getGoodsRecipientShipToParty() {
        return goodsRecipientShipToParty;
    }

    public void setGoodsRecipientShipToParty(String goodsRecipientShipToParty) {
        this.goodsRecipientShipToParty = goodsRecipientShipToParty;
    }

    public String getDestinationStorageType() {
        return destinationStorageType;
    }

    public void setDestinationStorageType(String destinationStorageType) {
        this.destinationStorageType = destinationStorageType;
    }

    public String getDestinationStorageSection() {
        return destinationStorageSection;
    }

    public void setDestinationStorageSection(String destinationStorageSection) {
        this.destinationStorageSection = destinationStorageSection;
    }

    public String getDestinationStorageBin() {
        return destinationStorageBin;
    }

    public void setDestinationStorageBin(String destinationStorageBin) {
        this.destinationStorageBin = destinationStorageBin;
    }

    public String getRequestedQuantityInAlternativeUnitOfMeasure() {
        return requestedQuantityInAlternativeUnitOfMeasure;
    }

    public void setRequestedQuantityInAlternativeUnitOfMeasure(String requestedQuantityInAlternativeUnitOfMeasure) {
        this.requestedQuantityInAlternativeUnitOfMeasure = requestedQuantityInAlternativeUnitOfMeasure;
    }

    public String getConfirmationOfTransferOrderItemIndicator() {
        return confirmationOfTransferOrderItemIndicator;
    }

    public void setConfirmationOfTransferOrderItemIndicator(String confirmationOfTransferOrderItemIndicator) {
        this.confirmationOfTransferOrderItemIndicator = confirmationOfTransferOrderItemIndicator;
    }

    public String getCertificateNumber() {
        return CertificateNumber;
    }

    public void setCertificateNumber(String CertificateNumber) {
        this.CertificateNumber = CertificateNumber;
    }

    public String getDateOfGoodsReceipt() {
        return dateOfGoodsReceipt;
    }

    public void setDateOfGoodsReceipt(String dateOfGoodsReceipt) {
        this.dateOfGoodsReceipt = dateOfGoodsReceipt;
    }

    public String getSourceStorageType() {
        return sourceStorageType;
    }

    public void setSourceStorageType(String sourceStorageType) {
        this.sourceStorageType = sourceStorageType;
    }

    public String getSourceStorageBin() {
        return sourceStorageBin;
    }

    public void setSourceStorageBin(String sourceStorageBin) {
        this.sourceStorageBin = sourceStorageBin;
    }

    public String getShelfLifeExpirationOrBestBeforeDate() {
        return shelfLifeExpirationOrBestBeforeDate;
    }

    public void setShelfLifeExpirationOrBestBeforeDate(String shelfLifeExpirationOrBestBeforeDate) {
        this.shelfLifeExpirationOrBestBeforeDate = shelfLifeExpirationOrBestBeforeDate;
    }

    public String getDestinationStorageUnitNumber() {
        return destinationStorageUnitNumber;
    }

    public void setDestinationStorageUnitNumber(String destinationStorageUnitNumber) {
        this.destinationStorageUnitNumber = destinationStorageUnitNumber;
    }

    @Override
    public String toString() {
        return "StockMainWarehouseAU{" + "warehouseNumber=" + warehouseNumber + ", requirementNumber=" + requirementNumber + ", requirementType=" + requirementType + ", groupRefNr=" + groupRefNr + ", movementType=" + movementType + ", materialNumber=" + materialNumber + ", legacyMaterialNumber=" + legacyMaterialNumber + ", plant=" + plant + ", warehouseLocation=" + storageLocation + ", batchNumber=" + batchNumber + ", stockCategory=" + stockCategory + ", specialStockIndicator=" + specialStockIndicator + ", specialStockNumber=" + specialStockNumber + ", alternativeUnitOfMeasureForStockkeepingUnit=" + alternativeUnitOfMeasureForStockkeepingUnit + ", storageUnitType=" + storageUnitType + ", goodsRecipientShipToParty=" + goodsRecipientShipToParty + ", destinationStorageType=" + destinationStorageType + ", destinationStorageSection=" + destinationStorageSection + ", destinationStorageBin=" + destinationStorageBin + ", requestedQuantityInAlternativeUnitOfMeasure=" + requestedQuantityInAlternativeUnitOfMeasure + ", confirmationOfTransferOrderItemIndicator=" + confirmationOfTransferOrderItemIndicator + ", CertificateNumber=" + CertificateNumber + ", dateOfGoodsReceipt=" + dateOfGoodsReceipt + ", sourceStorageType=" + sourceStorageType + ", sourceStorageBin=" + sourceStorageBin + ", shelfLifeExpirationOrBestBeforeDate=" + shelfLifeExpirationOrBestBeforeDate + ", destinationStorageUnitNumber=" + destinationStorageUnitNumber + '}';
    }

    public String toCsvString() {
        return warehouseNumber + separatorChar + requirementNumber + separatorChar + requirementType + separatorChar + groupRefNr + separatorChar + movementType + separatorChar + materialNumber + separatorChar + legacyMaterialNumber + separatorChar + plant + separatorChar + storageLocation + separatorChar + batchNumber + separatorChar + stockCategory + separatorChar + specialStockIndicator + separatorChar + specialStockNumber + separatorChar + alternativeUnitOfMeasureForStockkeepingUnit + separatorChar + storageUnitType + separatorChar + goodsRecipientShipToParty + separatorChar + destinationStorageType + separatorChar + destinationStorageSection + separatorChar + destinationStorageBin + separatorChar + requestedQuantityInAlternativeUnitOfMeasure + separatorChar + confirmationOfTransferOrderItemIndicator + separatorChar + CertificateNumber + separatorChar + dateOfGoodsReceipt + separatorChar + sourceStorageType + separatorChar + sourceStorageBin + separatorChar + shelfLifeExpirationOrBestBeforeDate + separatorChar + destinationStorageUnitNumber;
    }

    @Override
    protected boolean mandatoryFieldsAvailable(boolean recordIsValid) {
        if (fieldHasContent(warehouseNumber, "warehouseNumber")
                && fieldHasContent(movementType, "movementType")
                && fieldHasContent(materialNumber, "materialNumber")
                && fieldHasContent(legacyMaterialNumber, "legacyMaterialNumber")
                && fieldHasContent(plant, "plant")
                && fieldHasContent(storageLocation, "storageLocation")
                && fieldHasContent(batchNumber, "batchNumber")
                && fieldHasContent(alternativeUnitOfMeasureForStockkeepingUnit, "alternativeUnitOfMeasureForStockkeepingUnit")
                && fieldHasContent(storageUnitType, "storageUnitType")
                && fieldHasContent(destinationStorageType, "destinationStorageType")
                && fieldHasContent(destinationStorageSection, "destinationStorageSection")
                && fieldHasContent(destinationStorageBin, "destinationStorageBin")
                && fieldHasContent(requestedQuantityInAlternativeUnitOfMeasure, "requestedQuantityInAlternativeUnitOfMeasure")
                && fieldHasContent(confirmationOfTransferOrderItemIndicator, "confirmationOfTransferOrderItemIndicator")) {
            recordIsValid = true;
        }
        return recordIsValid;
    }

    @Override
    protected boolean fieldContentIsValid(boolean recordIsValid) {
        return true;
    }
}
