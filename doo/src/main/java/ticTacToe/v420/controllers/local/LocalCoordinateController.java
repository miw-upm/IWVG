package ticTacToe.v420.controllers.local;

import ticTacToe.v420.controllers.CoordinateController;
import ticTacToe.v420.models.Coordinate;
import ticTacToe.v420.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
