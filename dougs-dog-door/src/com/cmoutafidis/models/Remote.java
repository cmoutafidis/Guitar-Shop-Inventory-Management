package com.cmoutafidis.models;

import java.util.Timer;
import java.util.TimerTask;

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

            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    dogDoor.close();
                    timer.cancel();
                }
            }, 5000);
        }
    }

}
