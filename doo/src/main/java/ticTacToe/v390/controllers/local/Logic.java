package ticTacToe.v390.controllers.local;

import ticTacToe.v390.models.Game;

public class Logic {

	private Game game;

	private LocalColocateControllerBuilder colocateControllerBuilder;
	
	private LocalStartController startController;

	private LocalContinueController continueController;

	public Logic() {
		game = new Game();
		colocateControllerBuilder = new LocalColocateControllerBuilder(game);
		startController = new LocalStartController(game, colocateControllerBuilder);
		continueController = new LocalContinueController(game);
	}

	public LocalOperationController getController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
		case IN_GAME:
			return colocateControllerBuilder.getColocateController();
		case FINAL:
			return continueController;
		case EXIT:
		default:
			return null;
		}
	}
}
