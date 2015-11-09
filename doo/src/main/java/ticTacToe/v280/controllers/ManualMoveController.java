package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;
import ticTacToe.v280.models.Coordinate;

public class ManualMoveController extends MoveController {

	public ManualMoveController(Game game) {
		super(game);
	}

	@Override
	protected Coordinate selectOrigin() {
		Coordinate origin = new Coordinate();
		origin.read("De");
		return origin;
	}

	@Override
	protected Coordinate selectTarget(String targetTitle) {
		Coordinate target = new Coordinate();
		target.read(targetTitle);
		return target;
	}

}
