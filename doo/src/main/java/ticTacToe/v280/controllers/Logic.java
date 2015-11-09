package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;

public class Logic {

	private Game game;

	private StartController startController;

	private ContinueController continueController;

	public Logic() {
		game = new Game();
		startController = new StartController(game);
		continueController = new ContinueController(game);
	}

	public Controller getController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
		case IN_GAME:
			int player = game.getTurn().take().ordinal(); 
			int colocate = !game.getBoard().complete()?0:1;
			return startController.getColocateControllerArray()[player][colocate];
		case FINAL:
			return continueController;
		case EXIT:
		default:
			return null;
		}
	}
}
