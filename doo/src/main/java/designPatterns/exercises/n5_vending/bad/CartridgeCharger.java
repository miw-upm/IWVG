package designPatterns.exercises.n5_vending.bad;

public class CartridgeCharger {

	private int amount;
	
	private static final int MINIMUM = 1;

	private WaterTank waterTank;

	private SugarDeposit sugarDeposit;

	private Panel panel;

	public CartridgeCharger() {
		amount = 0;
	}

	public void set(WaterTank waterTank,
			SugarDeposit sugarDeposit, Panel panel) {
		this.waterTank = waterTank;
		this.sugarDeposit = sugarDeposit;
		this.panel = panel;
	}

	public void add(int amount) {
		this.amount += amount;
		if (this.hasCartridgeCharger()) {
			if (waterTank.hasEnoughMilliliters()
					&& sugarDeposit.hasEnoughMilligrams()) {
				panel.activeVending();
			}
		}
	}

	public void remove(int amount) {
		this.amount -= amount;
		if (!this.hasCartridgeCharger()) {
			panel.deactiveVending();
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
