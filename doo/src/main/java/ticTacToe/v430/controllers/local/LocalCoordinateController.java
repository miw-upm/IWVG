package ticTacToe.v430.controllers.local;

import ticTacToe.v430.controllers.CoordinateController;
import ticTacToe.v430.models.Coordinate;
import ticTacToe.v430.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}