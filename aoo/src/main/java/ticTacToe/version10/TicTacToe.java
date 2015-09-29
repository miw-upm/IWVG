package ticTacToe.version10;

public class TicTacToe {

	private Board board;
	private Player[] players;
	private Turn turn;

	public TicTacToe() {
		board = new Board();
		turn = new Turn();
		players = new Player[2];
        char[] CHARACTERS = {'x', 'o'};
        for(int i=0; i<2; i++){
            players[i] = new Player(CHARACTERS[i]);
        }
	}

	public void play() {
		StartController startController = new StartController(board);
		startController.control();
		do {
			if (!board.complete()) {
				PutController putController = new PutController(board, players[turn.take()]);
				putController.control();
			} else {
				MoveController moveController = new MoveController(board, players[turn.take()]);
				moveController.control();
			}
		} while (!board.existTicTacToe());
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
