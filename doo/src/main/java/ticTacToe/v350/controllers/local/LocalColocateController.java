package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.CoordinateController;
import ticTacToe.v350.controllers.Error;
import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

abstract class LocalColocateController extends LocalOperationController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(Game game, 
			LocalCoordinateController coordinateController) {
		super(game);
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}
	
	protected Error validateTarget(Coordinate target) {
		assert target != null;
		if (!this.empty(target)) {
			return Error.NOT_EMPTY;
		}
		return null;
	}

	public CoordinateController getCoordinateController(){
		return coordinateController;
	}

}
