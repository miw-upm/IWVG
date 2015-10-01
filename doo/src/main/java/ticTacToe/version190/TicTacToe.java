package ticTacToe.version190;

public class TicTacToe {

	private Board board;

	private Turn turn;

	public static final int NUM_PLAYERS = 2;
	
	private StartController startController;
	
	private PutController[] putControllers;
	
	private MoveController[] moveControllers;

	public TicTacToe() {
		board = new Board();
		turn = new Turn();
		startController = new StartController(board, turn);
	}

	public void play() {
		startController.control();
		putControllers = startController.getPutControllers();
		moveControllers = startController.getMoveControllers();
		do {
			if (!board.complete()) {
				putControllers[turn.take()].control();
			} else {
				moveControllers[turn.take()].control();
			}
		} while (!board.existTicTacToe());
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
