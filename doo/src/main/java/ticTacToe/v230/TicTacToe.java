package ticTacToe.v230;

public class TicTacToe {

	private Turn turn;

	private Board board;

	private PutController putController;

	private MoveController moveController;

	private static final int NUM_PLAYERS = 2;

	public TicTacToe() {
		turn = new Turn();
		board = new Board(TicTacToe.NUM_PLAYERS);
		putController = new PutController(turn, board);
		moveController = new MoveController(turn, board);
	}

	public void play() {
		board.write();
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
