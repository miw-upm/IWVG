package ticTacToe.v330.controllers;

import ticTacToe.v330.models.Game;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(OperationControllerVisitor operationControllerVisitor);
	

}
