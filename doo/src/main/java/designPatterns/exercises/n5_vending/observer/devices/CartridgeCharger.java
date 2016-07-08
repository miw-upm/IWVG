package designPatterns.exercises.n5_vending.observer.devices;

public class CartridgeCharger extends Subject {

	private int amount;

	private static final int MINIMUM = 1;

	public CartridgeCharger() {
		amount = 0;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasCartridgeCharger()) {
			this.notifies(); //panel.activeVending();
		}
	}

	public void remove(int amount) {
		this.amount -= amount;
		if (!this.hasCartridgeCharger()) {
			this.notifies(); //panel.deactiveVending();
		}
	}

	public boolean hasCartridgeCharger() {
		return amount >= CartridgeCharger.MINIMUM;
	}

	@Override
	public String toString() {
		return "CartridgeCharger [amount=" + amount + "]";
	}

}
