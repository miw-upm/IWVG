package ticTacToe.v370.controllers.local;

import ticTacToe.v370.controllers.CoordinateController;
import ticTacToe.v370.models.Coordinate;
import ticTacToe.v370.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
