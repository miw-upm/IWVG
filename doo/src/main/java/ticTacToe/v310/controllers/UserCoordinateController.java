package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Game;
import ticTacToe.v310.models.Coordinate;

public class UserCoordinateController extends CoordinateController {

	protected UserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		return new Coordinate();
	}

	@Override
	public Coordinate getTarget() {
		return new Coordinate();
	}
	
}
