package ticTacToe.version180;

public class TicTacToe {

	private Board board;

	private Turn turn;

	public static final int NUM_PLAYERS = 2;
	
	private StartController startController;
	
	private PutController putController;
	
	private MoveController moveController;

	public TicTacToe() {
		board = new Board();
		turn = new Turn();
		startController = new StartController(board);
		putController = new PutController(board, turn);
		moveController = new MoveController(board, turn);
	}

	public void play() {
		startController.control();
		do {
			if (!board.complete()) {
				putController.control();
			} else {
				moveController.control();
			}
		} while (!board.existTicTacToe());
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
