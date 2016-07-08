package designPatterns.exercises.n5_vending.bad;

public class Panel {

	private CartridgeCharger cartridgeCharger;

	private SugarDeposit sugarDeposit;

	private WaterTank waterTank;

	private boolean active;

	public void set(CartridgeCharger cartridgeCharger,
			SugarDeposit sugarDeposit, WaterTank waterTank) {
		this.cartridgeCharger = cartridgeCharger;
		this.sugarDeposit = sugarDeposit;
		this.waterTank = waterTank;
		active = false;
	}

	public void activeVending() {
		active = true;
		System.out.println("Activa: " + active);
	}

	public void deactiveVending() {
		active = false;
		System.out.println("Activa: " + active);
	}
	
	public void sell(){
		cartridgeCharger.remove(1);
		sugarDeposit.remove(10);
		waterTank.remove(100);
	}
	
	@Override
	public String toString() {
		return "Panel [active=" + active + "]";
	}

}
