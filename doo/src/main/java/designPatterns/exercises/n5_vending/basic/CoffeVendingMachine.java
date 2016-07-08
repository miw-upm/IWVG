package designPatterns.exercises.n5_vending.basic;

import designPatterns.exercises.n5_vending.basic.devices.DeviceFacade;

public class CoffeVendingMachine {

	private void exec() {
		DeviceFacade.instance().sell();
	}

	public static void main(String[] args) {
		new CoffeVendingMachine().exec();
	}
}
