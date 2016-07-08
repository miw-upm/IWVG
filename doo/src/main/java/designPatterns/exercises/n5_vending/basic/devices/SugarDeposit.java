package designPatterns.exercises.n5_vending.basic.devices;

public class SugarDeposit extends PanelColleague {

	private int amount;

	private static final int MINIMUM = 12;

	public SugarDeposit(Panel panel) {
		super(panel);
		panel.set(this);
		amount = 0;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasEnoughMilligrams()) {
			panel.activeVending();
		}
	}

	public void remove(int amount) {
		this.amount -= amount;
		if (!this.hasEnoughMilligrams()) {
			panel.deactiveVending();
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
