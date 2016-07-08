package designPatterns.exercises.n5_vending.bad;

public class WaterTank {

	private int amount;
	
	private static final int MINIMUM = 100;

	private CartridgeCharger cartridgeCharger;

	private SugarDeposit sugarDeposit;

	private Panel panel;

	public WaterTank() {
		amount = 0;
	}

	public void set(CartridgeCharger cartridgeCharger,
			SugarDeposit sugarDeposit, Panel panel) {
		this.cartridgeCharger = cartridgeCharger;
		this.sugarDeposit = sugarDeposit;
		this.panel = panel;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasEnoughMilliliters()) {
			if (cartridgeCharger.hasCartridgeCharger()
					&& sugarDeposit.hasEnoughMilligrams()) {
				panel.activeVending();
			}
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
