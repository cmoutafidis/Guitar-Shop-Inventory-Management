package com.cmoutafidis.models;

import com.cmoutafidis.enums.GuitarBuilder;
import com.cmoutafidis.enums.GuitarType;
import com.cmoutafidis.enums.GuitarWood;

public class Guitar {

    private String serialNumber;
    private double price;
    private GuitarBuilder builder;
    private String model;
    private GuitarType type;
    private GuitarWood backWood;
    private GuitarWood topWood;

    public Guitar(final String serialNumber, final double price, final GuitarBuilder builder, final String model, final GuitarType type, final GuitarWood backWood, final GuitarWood topWood) {
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

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public GuitarBuilder getBuilder() {
        return this.builder;
    }

    public void setBuilder(final GuitarBuilder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public GuitarType getType() {
        return this.type;
    }

    public void setType(final GuitarType type) {
        this.type = type;
    }

    public GuitarWood getBackWood() {
        return this.backWood;
    }

    public void setBackWood(final GuitarWood backWood) {
        this.backWood = backWood;
    }

    public GuitarWood getTopWood() {
        return this.topWood;
    }

    public void setTopWood(final GuitarWood topWood) {
        this.topWood = topWood;
    }
}
