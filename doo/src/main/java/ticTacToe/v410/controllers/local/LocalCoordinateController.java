package ticTacToe.v410.controllers.local;

import ticTacToe.v410.controllers.CoordinateController;
import ticTacToe.v410.models.Coordinate;
import ticTacToe.v410.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
