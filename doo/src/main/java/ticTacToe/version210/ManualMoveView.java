package ticTacToe.version210;

public class ManualMoveView {

	private ManualMoveController manualMoveController;
	
	public ManualMoveView(Controller controller){
		this.manualMoveController = (ManualMoveController) controller;
	}
	
	public void render() {
		char colorValue = manualMoveController.getColor().getValue();
		IO io = new IO();
		io.writeln("Mueve el jugador " + colorValue);
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
		new BoardView(manualMoveController.getBoard()).render();
		if (manualMoveController.isGameOver()) {
			io.writeln("Victoria!!!! " 
					+ colorValue + "! "
					+ colorValue + "! "
					+ colorValue + "! Victoria!!!!");
		} else {
			manualMoveController.close();
		}
	}
}

