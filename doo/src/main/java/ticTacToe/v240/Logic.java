package ticTacToe.v240;

public class Logic {
	
	private Game game;

	private StartController startController;

	private PutController putController;

	private MoveController moveController;
	
	private ContinueController continueController;
	
	public Logic() {
		game = new Game();
		startController = new StartController(game);
		putController = new PutController(game);
		moveController = new MoveController(game);
		continueController = new ContinueController(game);
	}
	public GameController getController() {
		switch (game.getState()){
		case INITIAL:
			return startController;
		case IN_GAME:
			if (!game.getBoard().complete()){
				return putController;
			} else {
				return moveController;
			}	
		case FINAL:
			return continueController;
		case EXIT:
		default:
			return null;
		}
	}
}
