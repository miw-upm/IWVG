package ticTacToe.v360.controllers.local;

import ticTacToe.v360.controllers.CoordinateController;
import ticTacToe.v360.controllers.Error;
import ticTacToe.v360.models.Coordinate;
import ticTacToe.v360.models.Game;

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
