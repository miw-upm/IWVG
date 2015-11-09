package ticTacToe.v400.controllers.local;

import ticTacToe.v400.controllers.ColocateController;
import ticTacToe.v400.controllers.CoordinateController;
import ticTacToe.v400.controllers.Error;
import ticTacToe.v400.models.Coordinate;
import ticTacToe.v400.models.Game;

abstract class LocalColocateController extends LocalOperationController
		implements ColocateController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(Game game,
			LocalCoordinateController coordinateController) {
		super(game);
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}

	public Error validateTarget(Coordinate target) {
		if (!this.empty(target)) {
			return Error.NOT_EMPTY;
		}
		return null;
	}

	public CoordinateController getCoordinateController() {
		return coordinateController;
	}

}
