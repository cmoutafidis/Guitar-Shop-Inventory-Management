package com.cmoutafidis.models;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(final Guitar guitar) {
        this.guitars.add(guitar);
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
            if (searchSpec.equals(guitar.getGuitarSpec())) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

}
