package com.cmoutafidis.models;

import com.cmoutafidis.enums.GuitarBuilder;
import com.cmoutafidis.enums.GuitarType;
import com.cmoutafidis.enums.GuitarWood;

public class GuitarSpec {

    private GuitarBuilder builder;
    private String model;
    private GuitarType type;
    private int numString;
    private GuitarWood backWood;
    private GuitarWood topWood;

    public GuitarSpec(final GuitarBuilder builder, final String model, final GuitarType type, final int numString, final GuitarWood backWood, final GuitarWood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numString = numString;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof GuitarSpec)) {
            return false;
        }

        final GuitarSpec guitarSpec = (GuitarSpec) o;
        final String model = this.getModel();

        if (this.getBuilder() != guitarSpec.getBuilder()) {
            return false;
        }
        if (model != null && !model.equals("") && !model.toLowerCase().equals(guitarSpec.getModel().toLowerCase())) {
            return false;
        }
        if (this.getType() != guitarSpec.getType()) {
            return false;
        }
        if (this.getBackWood() != guitarSpec.getBackWood()) {
            return false;
        }
        if (this.getTopWood() != guitarSpec.getTopWood()) {
            return false;
        }
        if (this.getNumString() != guitarSpec.getNumString()) {
            return false;
        }

        return true;
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

    public int getNumString() {
        return this.numString;
    }

    public void setNumString(final int numString) {
        this.numString = numString;
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
