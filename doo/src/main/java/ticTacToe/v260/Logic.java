package ticTacToe.v260;

public class Logic {
	
	private Game game;

	private StartController startController;

	private PutController putController;

	private MoveController moveController;
	
	public Logic() {
		game = new Game();
		startController = new StartController(game);
		putController = new PutController(game);
		moveController = new MoveController(game);
	}
	
	public Controller getController() {
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
		default:
			return null;
		}
	}
	
}
