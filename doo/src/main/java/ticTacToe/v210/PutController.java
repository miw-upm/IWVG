package ticTacToe.v210;

public class PutController {

	private Turn turn;

	private Board board;

	public PutController(Turn turn, Board board) {
		assert turn != null;
		assert board != null;
		this.turn = turn;
		this.board = board;
	}

	public void put() {
		IO io = new IO();
		io.writeln("Pone el jugador " + turn.take());
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		boolean ok;
		do {
			target.read("En");
			ok = board.empty(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
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
