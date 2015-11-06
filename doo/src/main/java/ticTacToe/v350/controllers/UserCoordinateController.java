package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

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
