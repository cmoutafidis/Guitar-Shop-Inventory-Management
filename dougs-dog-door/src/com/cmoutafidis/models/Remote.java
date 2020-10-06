package com.cmoutafidis.models;

public class Remote {

    private final DogDoor dogDoor;

    public Remote(final DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");

        if (this.dogDoor.isOpen()) {
            this.dogDoor.close();
        } else {
            this.dogDoor.open();
        }
    }

}
