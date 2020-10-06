package com.cmoutafidis;

import com.cmoutafidis.enums.GuitarBuilder;
import com.cmoutafidis.enums.GuitarType;
import com.cmoutafidis.enums.GuitarWood;
import com.cmoutafidis.models.Guitar;
import com.cmoutafidis.models.GuitarSpec;
import com.cmoutafidis.models.Inventory;

import java.util.ArrayList;

public class Main {

    public static void main(final String[] args) {
        final Inventory inventory = new Inventory();
        Main.initializeInventory(inventory);

        final GuitarSpec watErinLikes = new GuitarSpec(GuitarBuilder.FENDER, "Stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER);

        final ArrayList<Guitar> matchingGuitars = inventory.search(watErinLikes);

        if (matchingGuitars.size() > 0) {
            System.out.println("Erin, you might like these guitars:");

            for (final Guitar guitar : matchingGuitars) {
                final GuitarSpec guitarSpec = guitar.getGuitarSpec();
                System.out.println("We have a " + guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " + guitarSpec.getType() + " guitar:");
                System.out.println(guitarSpec.getBackWood() + " back and sides,");
                System.out.println(guitarSpec.getTopWood() + " top.");
                System.out.println("You can have it for only $" + guitar.getPrice() + "!");
                System.out.println("----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(final Inventory inventory) {
        inventory.addGuitar(new Guitar("V95693", 1499.95, new GuitarSpec(GuitarBuilder.FENDER, "Stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER)));
        inventory.addGuitar(new Guitar("V9512", 1549.95, new GuitarSpec(GuitarBuilder.FENDER, "Stratocastor", GuitarType.ELECTRIC, GuitarWood.ALDER, GuitarWood.ALDER)));
    }
}
