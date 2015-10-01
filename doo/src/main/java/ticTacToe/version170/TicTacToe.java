package ticTacToe.version170;

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
		startController = new StartController();
		putController = new PutController();
		moveController = new MoveController();
	}

	public void play() {
		startController.start(board);
		do {
			if (!board.complete()) {
				putController.put(board, turn);
			} else {
				moveController.move(board, turn);
			}
		} while (!board.existTicTacToe());
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
