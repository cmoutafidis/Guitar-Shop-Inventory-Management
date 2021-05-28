package com.cmoutafidis;

import com.cmoutafidis.models.DogDoor;
import com.cmoutafidis.models.Remote;

public class Main {

    public static void main(final String[] args) {
        final DogDoor dogDoor = new DogDoor();
        final Remote remote = new Remote(dogDoor);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();

        System.out.println("Fido has gone outside...");
        System.out.println("Fido's all done...");
        System.out.println("Fido's back inside...");
    }
}
