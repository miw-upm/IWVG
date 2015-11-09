package ticTacToe.v380.controllers.local;

import ticTacToe.v380.controllers.CoordinateController;
import ticTacToe.v380.models.Coordinate;
import ticTacToe.v380.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
