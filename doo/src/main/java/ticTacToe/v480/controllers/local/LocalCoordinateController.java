package ticTacToe.v480.controllers.local;

import ticTacToe.v480.controllers.CoordinateController;
import ticTacToe.v480.models.Coordinate;
import ticTacToe.v480.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
