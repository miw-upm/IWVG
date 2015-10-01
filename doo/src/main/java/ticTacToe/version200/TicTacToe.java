package ticTacToe.version200;

public class TicTacToe {

	private Board board;

	private Turn turn;

	public static final int NUM_PLAYERS = 2;
	
	private StartController startController;
	
	private ColocateControllerFactory colocateControllerFactory;

	public TicTacToe() {
		board = new Board();
		turn = new Turn();
		colocateControllerFactory = new ColocateControllerFactory(board, turn);
		startController = new StartController(board, turn, colocateControllerFactory);
	}

	public void play() {
		startController.control();
		do {
			colocateControllerFactory.getColocateController().control();
		} while (!board.existTicTacToe());
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
