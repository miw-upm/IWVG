package designPatterns.exercises.n5_vending.bad;

public class CoffeVendingMachine {

	private CartridgeCharger cartridgeCharger;

	private SugarDeposit sugarDeposit;

	private WaterTank waterTank;

	private Panel panel;

	private CoffeVendingMachine() {
		cartridgeCharger = new CartridgeCharger();
		sugarDeposit = new SugarDeposit();
		waterTank = new WaterTank();
		panel = new Panel();

		cartridgeCharger.set(waterTank, sugarDeposit, panel);
		sugarDeposit.set(cartridgeCharger, waterTank, panel);
		waterTank.set(cartridgeCharger, sugarDeposit, panel);
		panel.set(cartridgeCharger, sugarDeposit, waterTank);

		cartridgeCharger.add(10);
		sugarDeposit.add(100);
		waterTank.add(1000);

		for (int i = 0; i < 12; i++) {
			panel.sell();
			System.out.println("---------------");
			System.out.println(cartridgeCharger);
			System.out.println(sugarDeposit);
			System.out.println(waterTank);
			System.out.println(panel);
		}
	}

	private void exec() {

	}

	public static void main(String[] args) {
		new CoffeVendingMachine().exec();
	}
}
