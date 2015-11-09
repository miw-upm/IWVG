package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Coordinate;
import ticTacToe.v310.models.Game;
import ticTacToe.v310.utils.IO;

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
		this.remove(origin);
	}

	private Error validateOrigin() {
		if (!this.full(origin)) {
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
