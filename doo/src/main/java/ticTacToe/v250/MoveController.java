package ticTacToe.v250;

import ticTacToe.v250.utils.IO;

public class MoveController extends ColocateController {

	private Coordinate origin;

	public MoveController(Turn turn, Board board) {
		super(turn, board);
		origin = new Coordinate();
	}
	
	@Override
	public void control(){
		this.control("Mueve", "A");
	}

	@Override
	protected void colocate(String targetTitle) {
		this.remove();
		this.put(targetTitle);
	}
	
	private void remove(){
		Error error;
		do {
			origin.read("De");
			error = this.errorToRemove(origin);
			if (error != null) {
				new IO().writeln("" + Error.NOT_PROPERTY);
			}
		} while (error != null);
		this.getBoard().remove(origin, this.getTurn().take());
	}

	private Error errorToRemove(Coordinate origin) {
		if (!this.getBoard().full(origin, this.getTurn().take())) {
			return Error.NOT_PROPERTY;
		}
		return null;
	}

	@Override
	protected Error errorToPut() {
		Error error = super.errorToPut();
		if (error != null) {
			return error;
		}
		if (origin.equals(this.getTarget())) {
				return Error.REPEATED_COORDINATE;
		}
		return null;
	}

}
