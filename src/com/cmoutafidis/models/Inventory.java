package com.cmoutafidis.models;

import com.cmoutafidis.enums.GuitarBuilder;
import com.cmoutafidis.enums.GuitarType;
import com.cmoutafidis.enums.GuitarWood;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(final String serialNumber, final double price, final GuitarBuilder builder, final String model, final GuitarType type, final GuitarWood backWood, final GuitarWood topWood) {
        this.guitars.add(new Guitar(serialNumber, price, new GuitarSpec(builder, model, type, backWood, topWood)));
    }

    public Guitar getGuitar(final String serialNumber) {
        for (final Guitar guitar : this.guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public ArrayList<Guitar> search(final GuitarSpec searchSpec) {
        final ArrayList<Guitar> matchingGuitars = new ArrayList<>();
        for (final Guitar guitar : this.guitars) {
            final GuitarSpec guitarSpec = guitar.getGuitarSpec();
            // Ignore Serial Number since it's unique
            // Ignore price since it's unique
            if (searchSpec.getBuilder() != guitarSpec.getBuilder()) {
                continue;
            }
            final String model = searchSpec.getModel();
            if (model != null && !model.equals("") && !model.toLowerCase().equals(guitarSpec.getModel().toLowerCase())) {
                continue;
            }
            if (searchSpec.getType() != guitarSpec.getType()) {
                continue;
            }
            if (searchSpec.getBackWood() != guitarSpec.getBackWood()) {
                continue;
            }
            if (searchSpec.getTopWood() != guitarSpec.getTopWood()) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
