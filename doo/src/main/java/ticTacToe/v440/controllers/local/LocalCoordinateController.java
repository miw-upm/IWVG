package ticTacToe.v440.controllers.local;

import ticTacToe.v440.controllers.CoordinateController;
import ticTacToe.v440.models.Coordinate;
import ticTacToe.v440.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(LocalLogic localLogic, Game game) {
		super(localLogic, game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
