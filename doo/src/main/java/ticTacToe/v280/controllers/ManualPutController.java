package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;
import ticTacToe.v280.models.TicTacToeCoordinate;

public class ManualPutController extends PutController{

	public ManualPutController(Game game) {
		super(game);
	}

	@Override
	protected TicTacToeCoordinate selectTarget(String targetTitle) {
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		target.read(targetTitle);
		return target;
	}

}
