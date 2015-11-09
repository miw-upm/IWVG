package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Game;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}

	public abstract void control();
	
}
