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
        this.guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
    }

    public Guitar getGuitar(final String serialNumber) {
        for (final Guitar guitar : this.guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(final Guitar searchGuitar) {
        for (final Guitar guitar : this.guitars) {
            // Ignore Serial Number since it's unique
            // Ignore price since it's unique
            if (searchGuitar.getBuilder() != guitar.getBuilder()) {
                continue;
            }
            final String model = searchGuitar.getModel();
            if (model != null && !model.equals("") && !model.toLowerCase().equals(guitar.getModel().toLowerCase())) {
                continue;
            }
            if (searchGuitar.getType() != guitar.getType()) {
                continue;
            }
            if (searchGuitar.getBackWood() != guitar.getBackWood()) {
                continue;
            }
            if (searchGuitar.getTopWood() != guitar.getTopWood()) {
                continue;
            }
            return guitar;
        }
        return null;
    }

}
