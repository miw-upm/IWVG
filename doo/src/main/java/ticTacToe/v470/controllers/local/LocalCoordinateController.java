package ticTacToe.v470.controllers.local;

import ticTacToe.v470.controllers.CoordinateController;
import ticTacToe.v470.models.Coordinate;
import ticTacToe.v470.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
