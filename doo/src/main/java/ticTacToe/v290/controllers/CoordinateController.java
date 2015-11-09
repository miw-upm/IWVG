package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract TicTacToeCoordinate getOrigin();
	
	public abstract TicTacToeCoordinate getTarget(String targetTitle);


}
