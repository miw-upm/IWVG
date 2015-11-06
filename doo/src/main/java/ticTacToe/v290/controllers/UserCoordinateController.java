package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;
import ticTacToe.v290.models.Coordinate;

public class UserCoordinateController extends CoordinateController {

	protected UserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		Coordinate origin = new Coordinate();
		origin.read("De");
		return origin;
	}

	@Override
	public Coordinate getTarget(String targetTitle) {
		Coordinate target = new Coordinate();
		target.read(targetTitle);
		return target;
	}
	
}
