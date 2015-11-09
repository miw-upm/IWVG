package ticTacToe.v250;

import ticTacToe.v250.utils.IO;

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
	
	protected void control(String actionTitle, String targetTitle) {
		IO io = new IO();
		io.writeln(actionTitle + " el jugador " + turn.take());
		this.colocate(targetTitle);
		board.write();
		if (board.existTicTacToe(turn.take())) {
			io.writeln("Victoria!!!! " + turn.take() + "! " + turn.take()
					+ "! " + turn.take() + "! Victoria!!!!");
		} else {
			turn.change();
		}
	}

	protected abstract void colocate(String targetTitle);

	protected void put(String targetTitle) {
		target = new Coordinate();
		Error error;
		do {
			target.read(targetTitle);
			error = this.errorToPut();
			if (error != null){
				new IO().writeln(""+error);
			}
		} while (error != null);
		board.put(target, turn.take());
	}

	protected Error errorToPut() {
		if (!board.empty(target)) {
			return Error.NOT_EMPTY;
		}
		return null;
	}

	protected Turn getTurn() {
		return turn;
	}

	protected Board getBoard() {
		return board;
	}
	
	protected Coordinate getTarget() {
		return target;
	}

}
