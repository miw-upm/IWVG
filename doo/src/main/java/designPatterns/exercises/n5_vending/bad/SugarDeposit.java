package designPatterns.exercises.n5_vending.bad;

public class SugarDeposit {

	private int amount;
	
	private static final int MINIMUM = 12;

	private CartridgeCharger cartridgeCharger;

	private WaterTank waterTank;

	private Panel panel;

	public SugarDeposit() {
		amount = 0;
	}

	public void set(CartridgeCharger cartridgeCharger,
			WaterTank waterTank, Panel panel) {
		this.cartridgeCharger = cartridgeCharger;
		this.waterTank = waterTank;
		this.panel = panel;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasEnoughMilligrams()) {
			if (cartridgeCharger.hasCartridgeCharger()
					&& waterTank.hasEnoughMilliliters()) {
				panel.activeVending();
			}
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
