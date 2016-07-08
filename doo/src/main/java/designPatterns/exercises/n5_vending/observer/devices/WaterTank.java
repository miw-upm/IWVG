package designPatterns.exercises.n5_vending.observer.devices;

public class WaterTank extends Subject {

	private int amount;

	private static final int MINIMUM = 100;

	public WaterTank() {
		amount = 0;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasEnoughMilliliters()) {
			this.notifies(); //panel.activeVending();
		}
	}

	public void remove(int amount) {
		this.amount -= amount;
		if (!this.hasEnoughMilliliters()) {
			this.notifies(); //panel.deactiveVending();
		}
	}

	public boolean hasEnoughMilliliters() {
		return amount > WaterTank.MINIMUM;
	}

	@Override
	public String toString() {
		return "WaterTank [amount=" + amount + "]";
	}
}
