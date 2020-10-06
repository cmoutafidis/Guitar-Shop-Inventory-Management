package com.cmoutafidis.models;

public class Guitar {

    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(final String serialNumber, final double price, final GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public GuitarSpec getGuitarSpec() {
        return this.guitarSpec;
    }

    public void setGuitarSpec(final GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }
}
