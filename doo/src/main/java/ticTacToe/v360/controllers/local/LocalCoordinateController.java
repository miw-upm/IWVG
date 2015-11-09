package ticTacToe.v360.controllers.local;

import ticTacToe.v360.controllers.CoordinateController;
import ticTacToe.v360.models.Coordinate;
import ticTacToe.v360.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
