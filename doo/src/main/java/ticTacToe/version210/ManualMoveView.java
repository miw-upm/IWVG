package ticTacToe.version210;

public class ManualMoveView extends ColocateView {

	public ManualMoveView(ColocateController controller){
		super(controller, "Mueve");
	}
	
	@Override
	protected void colocate(char colorValue) {
		ManualMoveController manualMoveController = (ManualMoveController)colocateController;
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			origin.read("De");
			ok = manualMoveController.isPosibleRemove(origin);
			if (!ok) {
				new IO().writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		manualMoveController.remove(origin);
		Coordinate target = new Coordinate();
		do {
			target.read("A qué casilla?");
			ok = manualMoveController.isPosibleMove(origin, target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		manualMoveController.put(target);
	}
	
}

