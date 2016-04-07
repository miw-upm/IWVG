package ticTacToe.v440.controllers.local;

import ticTacToe.v440.controllers.ColocateController;
import ticTacToe.v440.controllers.CoordinateController;
import ticTacToe.v440.models.Coordinate;
import ticTacToe.v440.models.Game;
import ticTacToe.v440.controllers.errors.ErrorReport;
import ticTacToe.v440.controllers.errors.ErrorGeneratorType;

abstract class LocalColocateController extends LocalOperationController
		implements ColocateController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(LocalLogic localLogic, Game game,
			LocalCoordinateController coordinateController) {
		super(localLogic, game);
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
