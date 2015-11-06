package ticTacToe.v340.controllers;

import ticTacToe.v340.models.Game;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(OperationControllerVisitor operationControllerVisitor);
	

}
