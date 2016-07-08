package designPatterns.exercises.n5_vending.observer;

import designPatterns.exercises.n5_vending.observer.devices.DeviceFacade;

public class CoffeVendingMachine {

	private void exec() {
		DeviceFacade.instance().sell();
	}

	public static void main(String[] args) {
		new CoffeVendingMachine().exec();
	}
}
