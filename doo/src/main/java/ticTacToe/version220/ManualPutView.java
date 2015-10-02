package ticTacToe.version220;

public class ManualPutView {

	private ManualPutController manualPutController;
	
	public ManualPutView(Controller controller){
		this.manualPutController = (ManualPutController) controller;
	}
	
	public void render() {
		char colorValue = manualPutController.getColor().getValue();
		IO io = new IO();
		io.writeln("Pone el jugador " + colorValue);
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
		new BoardView(manualPutController.getBoard()).render();
		if (manualPutController.isGameOver()) {
			io.writeln("Victoria!!!! " 
					+ colorValue + "! "
					+ colorValue + "! "
					+ colorValue + "! Victoria!!!!");
		} else {
			manualPutController.close();
		}
	}
}
