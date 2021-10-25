package com.eacuamba.java_como_programar.chapter_10._10_9_creating_and_using_interfaces.creating_and_using_interfaces;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = validateQuantity(quantity);
        this.pricePerItem = validatePricePerItem(pricePerItem);
    }

    public static  double validatePricePerItem(double pricePerItem){
        if(pricePerItem < 0D)
            throw new IllegalArgumentException("The price per item must be more than or equal  to zero.");
        return pricePerItem;
    }
    private static int validateQuantity(int quantity){
        if(quantity < 0)
            throw new IllegalArgumentException("The quantity must be more than or equal  to zero.");

        return quantity;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = validateQuantity(quantity);
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = validatePricePerItem(pricePerItem);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber=" + partNumber +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }

    @Override
    public double getPaymentAmount(){
        return this.getPricePerItem() * this.quantity;
    }
}
