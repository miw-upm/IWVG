package ticTacToe.version300;

public class AutomaticMoveView {

	private AutomaticMoveController automaticMoveController;
	
	public AutomaticMoveView(Controller controller){
		this.automaticMoveController = (AutomaticMoveController) controller;
	}
	
	public void render() {
		char colorValue = automaticMoveController.getColor().getValue();
		IO io = new IO();
		io.writeln("Mueve el jugador " + colorValue);
		Coordinate origin = automaticMoveController.getOrigin();
		io.writeln("Se va a quita un " + colorValue + " de " + origin);
		io.readString("Pulse <Enter> para continuar");
		automaticMoveController.remove(origin);
		Coordinate target = automaticMoveController.getTarget(origin);
		io.writeln("Se va a poner un " + colorValue + " en " + target);
		io.readString("Pulse <Enter> para continuar");
		automaticMoveController.put(target);
		new BoardView(automaticMoveController.getBoard()).render();
		if (automaticMoveController.isGameOver()) {
			io.writeln("Victoria!!!! " 
					+ colorValue + "! "
					+ colorValue + "! "
					+ colorValue + "! Victoria!!!!");
		} else {
			automaticMoveController.close();
		}
	}
}
