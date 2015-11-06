package ticTacToe.v290.controllers;

import ticTacToe.v290.models.Game;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}

	public abstract void control();
	
}
