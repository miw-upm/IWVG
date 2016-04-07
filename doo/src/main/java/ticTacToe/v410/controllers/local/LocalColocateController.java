package ticTacToe.v410.controllers.local;

import ticTacToe.v410.controllers.ColocateController;
import ticTacToe.v410.controllers.CoordinateController;
import ticTacToe.v410.controllers.Error;
import ticTacToe.v410.models.Coordinate;
import ticTacToe.v410.models.Game;

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
