package ticTacToe.v220;

import ticTacToe.v230.utils.IO;

public abstract class ColocateController {

	private Turn turn;

	private Board board;
	
	private Coordinate target;

	protected ColocateController(Turn turn, Board board) {
		assert turn != null;
		assert board != null;
		this.turn = turn;
		this.board = board;
		target = new Coordinate();
	}
	
	public abstract void control();
	
	protected void put(String actionTitle, String targetTitle) {		
		IO io = new IO();
		io.writeln(actionTitle + " el jugador " + turn.take());
		this.prePut();
		boolean ok;
		do {
			target.read(targetTitle);
			ok = this.errorToPut();
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
	
	protected abstract void prePut();
	
	protected boolean errorToPut() {
		boolean ok = this.getBoard().empty(this.getTarget());
		if (!ok) {
			new IO().writeln("Esa casilla no está vacía");
		}
		return ok;
	}

	protected Turn getTurn() {
		return turn;
	}

	protected Board getBoard() {
		return board;
	}	
	
	protected Coordinate getTarget(){
		return target;
	}
	
}
