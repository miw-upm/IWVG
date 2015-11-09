package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.CoordinateController;
import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
