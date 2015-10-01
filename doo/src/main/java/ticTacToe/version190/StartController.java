package ticTacToe.version190;

public class StartController extends Controller {

	private PutController[] putControllers;

	private MoveController[] moveControllers;

	protected StartController(Board board, Turn turn) {
		super(board, turn);
		putControllers = new PutController[TicTacToe.NUM_PLAYERS];
		moveControllers = new MoveController[TicTacToe.NUM_PLAYERS];
	}

	public void control() {
		int numPlayers = new LimitedIntDialog("Cuantos usuarios jugarán?", 0,
				TicTacToe.NUM_PLAYERS).read();
		for (int i = 0; i < TicTacToe.NUM_PLAYERS; i++) {
			if (i < numPlayers) {
				putControllers[i] = new ManualPutController(board, turn);
				moveControllers[i] = new ManualMoveController(board, turn);
			} else {
				putControllers[i] = new AutomaticPutController(board, turn);
				moveControllers[i] = new AutomaticMoveController(board, turn);
			}
		}
		board.write();
	}

	public PutController[] getPutControllers() {
		return putControllers;
	}

	public MoveController[] getMoveControllers() {
		return moveControllers;
	}

}
