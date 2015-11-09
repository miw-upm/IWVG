package ticTacToe.v370.controllers.local;

import ticTacToe.v370.controllers.CoordinateController;
import ticTacToe.v370.controllers.Error;
import ticTacToe.v370.models.Coordinate;
import ticTacToe.v370.models.Game;

abstract class LocalColocateController extends LocalOperationController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(Game game, 
			LocalCoordinateController coordinateController) {
		super(game);
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}
	
	protected Error validateTarget(Coordinate target) {
		if (!this.empty(target)) {
			return Error.NOT_EMPTY;
		}
		return null;
	}

	public CoordinateController getCoordinateController(){
		return coordinateController;
	}

}
