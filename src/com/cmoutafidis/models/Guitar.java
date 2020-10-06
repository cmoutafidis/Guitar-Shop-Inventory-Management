package com.cmoutafidis.models;

public class Guitar {

    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backWood;
    private String topWood;

    public Guitar(final String serialNumber, final double price, final String builder, final String model, final String type, final String backWood, final String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBuilder() {
        return this.builder;
    }

    public void setBuilder(final String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getBackWood() {
        return this.backWood;
    }

    public void setBackWood(final String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return this.topWood;
    }

    public void setTopWood(final String topWood) {
        this.topWood = topWood;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }
}
