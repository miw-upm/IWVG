package ticTacToe.v300.controllers;

import ticTacToe.v300.models.Game;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}

	public abstract void control();
	
}
