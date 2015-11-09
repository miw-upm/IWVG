package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;
import ticTacToe.v290.models.Coordinate;
import ticTacToe.v290.utils.IO;

public class MoveController extends ColocateController {

	private Coordinate origin;
	
	public MoveController(Game game, CoordinateController coordinateController) {
		super(game, "Mueve", coordinateController);
	}

	@Override
	protected void colocate() {
		this.remove();
		this.put("A");
	}
	
	private void remove(){
		Error error;
		do {
			origin = this.getCoordinateController().getOrigin();
			error = this.validateOrigin();
			if (error != null){
				new IO().writeln(""+error);
			}
		} while (error != null);	
		this.getBoard().remove(origin, this.getTurn().take());
	}
	
	private Error validateOrigin() {
		if (!this.getBoard().full(origin, this.getTurn().take())) {
			return Error.NOT_PROPERTY;
		}
		return null;
	}
	
	@Override
	protected Error validateTarget() {
		Error error = super.validateTarget();
		if (error != null) {
			return error;
		}
		if (origin.equals(this.getTarget())) {
				return Error.REPEATED_COORDINATE;
		}
		return null;
	}
	
	
	
}
