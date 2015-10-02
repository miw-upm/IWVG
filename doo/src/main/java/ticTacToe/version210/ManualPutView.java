package ticTacToe.version210;

public class ManualPutView extends ColocateView {

	public ManualPutView(ColocateController controller){
		super(controller, "Pone");
	}
	
	@Override
	protected void colocate(char colorValue) {
		ManualPutController manualPutController = (ManualPutController)colocateController;
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			target.read("En qué casilla?");
			ok = manualPutController.isPosiblePut(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		manualPutController.put(target);
	}
	
}
