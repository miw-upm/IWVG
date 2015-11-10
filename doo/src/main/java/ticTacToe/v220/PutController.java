package ticTacToe.v220;

import ticTacToe.v230.utils.IO;

public class PutController {

	private Turn turn;

	private Board board;
	
	private Coordinate target;
	
	public PutController(Turn turn, Board board) {
		assert turn != null;
		assert board != null;
		this.turn = turn;
		this.board = board;
		target = new Coordinate();
	}
	
	public void put(){
		IO io = new IO();
		io.writeln("Pone el jugador " + turn.take());
		boolean ok;
		do {
			target.read("En");
			ok = board.empty(target);
			if (!ok) {
				new IO().writeln("Esa casilla no está vacía");
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
