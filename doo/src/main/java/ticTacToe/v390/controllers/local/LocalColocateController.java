package ticTacToe.v390.controllers.local;

import ticTacToe.v390.controllers.CoordinateController;
import ticTacToe.v390.controllers.Error;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.models.Game;

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
