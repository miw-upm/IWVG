package ticTacToe.v340.controllers;

import ticTacToe.v340.models.Game;
import ticTacToe.v340.models.State;

public class ContinueController extends OperationController {

	ContinueController(Game game) {
		super(game);
	}
	
	public void setContinue(boolean another){
		assert this.getState() == State.FINAL;
		if (another) {
			this.clear();
			this.setState(State.INITIAL);
		} else {
			this.setState(State.EXIT);
		}
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);		
	}

}
