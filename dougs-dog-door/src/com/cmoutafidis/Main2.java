package com.cmoutafidis;

import com.cmoutafidis.models.DogDoor;
import com.cmoutafidis.models.Remote;

public class Main2 {

	public static void main(final String[] args) {
		final DogDoor dogDoor = new DogDoor();
		final Remote remote = new Remote(dogDoor);

		System.out.println();
		remote.pressButton();
		System.out.println("Fido has gone outside...");
		System.out.println("\nFido's all done...");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("...but he's stuck outside!");
		System.out.println("...so Gina grabs the remote control.");
		remote.pressButton();
		System.out.println("\nFibo's back inside...");

	}
}
