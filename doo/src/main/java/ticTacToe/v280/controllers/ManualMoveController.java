package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;
import ticTacToe.v280.models.TicTacToeCoordinate;

public class ManualMoveController extends MoveController {

	public ManualMoveController(Game game) {
		super(game);
	}

	@Override
	protected TicTacToeCoordinate selectOrigin() {
		TicTacToeCoordinate origin = new TicTacToeCoordinate();
		origin.read("De");
		return origin;
	}

	@Override
	protected TicTacToeCoordinate selectTarget(String targetTitle) {
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		target.read(targetTitle);
		return target;
	}

}
