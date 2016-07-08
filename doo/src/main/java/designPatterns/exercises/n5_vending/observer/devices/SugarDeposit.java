package designPatterns.exercises.n5_vending.observer.devices;

public class SugarDeposit extends Subject {

	private int amount;

	private static final int MINIMUM = 12;

	public SugarDeposit() {
		amount = 0;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasEnoughMilligrams()) {
			this.notifies(); //panel.activeVending();
		}
	}

	public void remove(int amount) {
		this.amount -= amount;
		if (!this.hasEnoughMilligrams()) {
			this.notifies(); //panel.deactiveVending();
		}
	}

	public boolean hasEnoughMilligrams() {
		return amount >= SugarDeposit.MINIMUM;
	}

	@Override
	public String toString() {
		return "SugarDeposit [amount=" + amount + "]";
	}
}
