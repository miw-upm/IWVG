package ticTacToe.v310.controllers;

import ticTacToe.v310.models.Game;
import ticTacToe.v310.models.State;

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

}
