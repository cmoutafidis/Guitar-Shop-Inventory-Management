package com.cmoutafidis;

import com.cmoutafidis.models.Guitar;
import com.cmoutafidis.models.Inventory;

public class Main {

    public static void main(final String[] args) {
        final Inventory inventory = new Inventory();
        Main.initializeInventory(inventory);

        final Guitar watErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");

        final Guitar guitar = inventory.search(watErinLikes);

        if (guitar != null) {
            System.out.println("Erin, you might like this:");
            System.out.println("SerialNumber: " + guitar.getSerialNumber());
            System.out.println("Price: " + guitar.getPrice());
            System.out.println("Builder: " + guitar.getBuilder());
            System.out.println("Model: " + guitar.getModel());
            System.out.println("Type: " + guitar.getType());
            System.out.println("BackWood: " + guitar.getBackWood());
            System.out.println("TopWood: " + guitar.getTopWood());
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(final Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
    }
}
