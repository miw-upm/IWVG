package ticTacToe.v400.controllers.local;

import ticTacToe.v400.controllers.CoordinateController;
import ticTacToe.v400.models.Coordinate;
import ticTacToe.v400.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
