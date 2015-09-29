package ticTacToe.version11;

public class TicTacToe {

	private Board board;
	private Player[] players;
	private Turn turn;
	private ColocateControllerFactory controllerFactory;

	public TicTacToe() {
		board = new Board();
		turn = new Turn();
		players = new Player[2];
		char[] CHARACTERS = { 'x', 'o' };
		for (int i = 0; i < 2; i++) {
			players[i] = new Player(CHARACTERS[i]);
		}
		controllerFactory = new ColocateControllerFactory();
	}

	public void play() {
		StartController startController = new StartController(board, controllerFactory);
		startController.control();
		do {
			if (!board.complete()) {
				ColocateController putController = controllerFactory.createPutController(turn, board, players[turn.take()]);
				putController.control();
			} else {
				ColocateController moveController = controllerFactory.createMoveController(turn, board, players[turn.take()]);
				moveController.control();
			}
		} while (!board.existTicTacToe());
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
