package ticTacToe.v320.controllers;

import ticTacToe.v320.models.Game;
import ticTacToe.v320.models.State;
import ticTacToe.v320.views.TicTacToeView;

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
	public void accept(TicTacToeView ticTacToeView) {
		ticTacToeView.visit(this);		
	}

}
