package ticTacToe.v210;

public class MoveController {

	private Turn turn;

	private Board board;

	public MoveController(Turn turn, Board board) {
		assert turn != null;
		assert board != null;
		this.turn = turn;
		this.board = board;
	}

	public void move() {
		IO io = new IO();
		io.writeln("Mueve el jugador " + turn.take());
		TicTacToeCoordinate origin = new TicTacToeCoordinate();
		boolean ok;
		do {
			origin.read("De");
			ok = board.full(origin, turn.take());
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		board.remove(origin, turn.take());
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		do {
			target.read("A");
			ok = board.empty(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			} else {
				ok = !origin.equals(target);
				if (!ok) {
					io.writeln("No se puede poner de donde se quitó");
				}
			}
		} while (!ok);
		board.put(target, turn.take());
		board.write();
		if (board.existTicTacToe(turn.take())) {
			io.writeln("Victoria!!!! " + turn.take() + "! " + turn.take()
					+ "! " + turn.take() + "! Victoria!!!!");
		} else {
			turn.change();
		}
	}

}
