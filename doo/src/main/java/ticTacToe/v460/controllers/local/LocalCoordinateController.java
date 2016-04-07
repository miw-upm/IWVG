package ticTacToe.v460.controllers.local;

import ticTacToe.v460.controllers.CoordinateController;
import ticTacToe.v460.models.Coordinate;
import ticTacToe.v460.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
