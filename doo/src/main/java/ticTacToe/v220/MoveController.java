package ticTacToe.v220;

import ticTacToe.v230.utils.IO;

public class MoveController {

	private Turn turn;

	private Board board;

	private Coordinate origin;

	private Coordinate target;

	public MoveController(Turn turn, Board board) {
		assert turn != null;
		assert board != null;
		this.turn = turn;
		this.board = board;
		origin = new Coordinate();
		target = new Coordinate();
	}

	public void move() {
		IO io = new IO();
		io.writeln("Mueve el jugador " + turn.take());
		origin = new Coordinate();
		boolean ok;
		do {
			origin.read("De");
			ok = board.full(origin, turn.take());
			if (!ok) {
				new IO().writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		board.remove(origin, turn.take());
		do {
			target.read("A");
			ok = board.empty(target);
			if (!ok) {
				new IO().writeln("Esa casilla no está vacía");
			} else {
				ok = !origin.equals(target);
				if (!ok) {
					new IO().writeln("No se puede poner de donde se quitó");
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
