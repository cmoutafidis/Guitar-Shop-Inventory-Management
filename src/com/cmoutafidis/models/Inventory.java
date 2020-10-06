package com.cmoutafidis.models;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(final String serialNumber, final double price, final String builder, final String model, final String type, final String backWood, final String topWood) {
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
            final String builder = searchGuitar.getBuilder();
            if (builder != null && !builder.equals("") && !builder.equals(guitar.getBuilder())) {
                continue;
            }
            final String model = searchGuitar.getModel();
            if (model != null && !model.equals("") && !model.equals(guitar.getModel())) {
                continue;
            }
            final String type = searchGuitar.getType();
            if (type != null && !type.equals("") && !type.equals(guitar.getType())) {
                continue;
            }
            final String backWood = searchGuitar.getBackWood();
            if (backWood != null && !backWood.equals("") && !backWood.equals(guitar.getBackWood())) {
                continue;
            }
            final String topWood = searchGuitar.getTopWood();
            if (topWood != null && !topWood.equals("") && !topWood.equals(guitar.getTopWood())) {
                continue;
            }
            return guitar;
        }
        return null;
    }

}
