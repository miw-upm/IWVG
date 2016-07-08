package designPatterns.exercises.n5_vending.basic.devices;


public class WaterTank extends PanelColleague {

	private int amount;

	private static final int MINIMUM = 100;

	public WaterTank(Panel panel) {
		super(panel);
		panel.set(this);
		amount = 0;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasEnoughMilliliters()) {
			panel.activeVending();
		}
	}

	public void remove(int amount) {
		this.amount -= amount;
		if (!this.hasEnoughMilliliters()) {
			panel.deactiveVending();
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
