package ticTacToe.v320.controllers;

import ticTacToe.v320.models.Game;
import ticTacToe.v320.views.TicTacToeView;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(TicTacToeView ticTacToeView);
	

}
