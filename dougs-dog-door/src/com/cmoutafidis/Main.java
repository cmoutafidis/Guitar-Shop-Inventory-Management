package com.cmoutafidis;

import com.cmoutafidis.models.DogDoor;
import com.cmoutafidis.models.Remote;

public class Main {

    public static void main(final String[] args) {
        final DogDoor dogDoor = new DogDoor();
        final Remote remote = new Remote(dogDoor);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        remote.pressButton();
        System.out.println("\nFido's all done...");
        remote.pressButton();
        System.out.println("\nFido's back inside...");
        remote.pressButton();
    }
}
