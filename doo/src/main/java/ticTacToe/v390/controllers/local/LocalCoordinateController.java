package ticTacToe.v390.controllers.local;

import ticTacToe.v390.controllers.CoordinateController;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
