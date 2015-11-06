package ticTacToe.v285.controllers;

import ticTacToe.v285.models.Game;


public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}

	public abstract void control();
	
}
