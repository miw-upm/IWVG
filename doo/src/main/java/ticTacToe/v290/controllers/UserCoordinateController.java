package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;

public class UserCoordinateController extends CoordinateController {

	protected UserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public TicTacToeCoordinate getOrigin() {
		TicTacToeCoordinate origin = new TicTacToeCoordinate();
		origin.read("De");
		return origin;
	}

	@Override
	public TicTacToeCoordinate getTarget(String targetTitle) {
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		target.read(targetTitle);
		return target;
	}
	
}
