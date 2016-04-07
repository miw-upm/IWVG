package ticTacToe.v420.controllers.local;

import ticTacToe.v420.Logic;
import ticTacToe.v420.models.Game;

public class LocalLogic implements Logic {

	private Game game;

	private LocalColocateControllerBuilder colocateControllerBuilder;
	
	private LocalStartController startController;

	private LocalContinueController continueController;

	public LocalLogic() {
		game = new Game();
		colocateControllerBuilder = new LocalColocateControllerBuilder(game);
		startController = new LocalStartController(game, colocateControllerBuilder);
		continueController = new LocalContinueController(game);
	}

	public LocalOperationController getOperationController() {
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
