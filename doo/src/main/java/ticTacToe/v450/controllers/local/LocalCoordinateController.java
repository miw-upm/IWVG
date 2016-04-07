package ticTacToe.v450.controllers.local;

import ticTacToe.v450.controllers.CoordinateController;
import ticTacToe.v450.models.Coordinate;
import ticTacToe.v450.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
