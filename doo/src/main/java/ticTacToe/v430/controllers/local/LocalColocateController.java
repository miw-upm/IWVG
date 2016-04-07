package ticTacToe.v430.controllers.local;

import ticTacToe.v430.controllers.ColocateController;
import ticTacToe.v430.controllers.CoordinateController;
import ticTacToe.v430.models.Coordinate;
import ticTacToe.v430.models.Game;
import ticTacToe.v430.controllers.errors.ErrorReport;
import ticTacToe.v430.controllers.errors.ErrorGeneratorType;

abstract class LocalColocateController extends LocalOperationController
		implements ColocateController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(Game game,
			LocalCoordinateController coordinateController) {
		super(game);
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}

	public ErrorReport validateTarget(Coordinate target) {
		if (!this.empty(target)) {
			return ErrorGeneratorType.NOT_EMPTY.getErrorReport(this.getGame());
		}
		return null;
	}

	public CoordinateController getCoordinateController() {
		return coordinateController;
	}

}
