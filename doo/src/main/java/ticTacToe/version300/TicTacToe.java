package ticTacToe.version300;

public class TicTacToe {

	public static final int NUM_PLAYERS = 2;
	
	private Board board;
	
	private Turn turn;
	
	private StartController startController;
	
	private ColocateControllerFactory colocateControllerFactory;
	
	private StartView startView;
		
	private GameView gameView;

	public TicTacToe() {
		board = new Board();
		turn = new Turn();
		colocateControllerFactory = new ColocateControllerFactory(board, turn);
		gameView = new GameView(colocateControllerFactory);
		startController = new StartController(board, turn, colocateControllerFactory);
		startView = new StartView(startController);
	}

	public void play() {
		startView.render();
		gameView.render();
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
