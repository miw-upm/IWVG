package ticTacToe.v330.controllers;

import ticTacToe.v330.models.Game;
import ticTacToe.v330.views.TicTacToeView;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(TicTacToeView ticTacToeView);
	

}
