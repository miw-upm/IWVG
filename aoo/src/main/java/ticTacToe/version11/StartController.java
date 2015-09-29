package ticTacToe.version11;

public class StartController {

	private Board board;
	
	private ColocateControllerFactory colocateControllerFactory;
	
	public StartController(Board board, ColocateControllerFactory colocateControllerFactory) {
		this.board = board;
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void control() {
		IO io = new IO();
		int manual;
		do {
			manual = io.readInt("¿Cuántos vais a jugar? [0-2]");
		} while (manual<0 || 2<manual);
		colocateControllerFactory.set(manual);
		board.write();
	}
}
