package designPatterns.exercises.n5_vending.observer.devices;

import designPatterns.exercises.n5_vending.observer.menu.main.MainMenu;

public class Panel extends Observer {

	private CartridgeCharger cartridgeCharger;

	private SugarDeposit sugarDeposit;

	private WaterTank waterTank;

	private MainMenu mainMenu;

	private boolean vendingActive;

	public Panel() {
		vendingActive = false;
	}

	public void set(CartridgeCharger cartridgeCharger) {
		this.cartridgeCharger = cartridgeCharger;
	}

	public void set(SugarDeposit sugarDeposit) {
		this.sugarDeposit = sugarDeposit;
	}

	public void set(WaterTank waterTank) {
		this.waterTank = waterTank;
	}

	@Override
	public void update() {
		if (this.isActiveVending()){
			this.activeVending();
		} else {
			this.deactiveVending();
		}
	}

	public void activeVending() {
		if (this.isActiveVending()) {
			vendingActive = true;
			System.out.println("Activa: " + vendingActive);
		}
	}

	public boolean isActiveVending() {
		return cartridgeCharger.hasCartridgeCharger()
				&& sugarDeposit.hasEnoughMilligrams()
				&& waterTank.hasEnoughMilliliters();
	}

	public void deactiveVending() {
		vendingActive = false;
		System.out.println("Activa: " + vendingActive);
	}

	public void sell() {
		mainMenu = new MainMenu();
		mainMenu.execute();
	}

	@Override
	public String toString() {
		return "Panel [active=" + vendingActive + "]";
	}

}
