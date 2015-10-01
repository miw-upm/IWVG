package ticTacToe.version200;

public class StartController extends Controller {

	ColocateControllerFactory colocateControllerFactory;
	
	protected StartController(Board board, Turn turn, ColocateControllerFactory colocateControllerFactory) {
		super(board, turn);
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void control() {
		int numPlayers = new LimitedIntDialog("Cuantos usuarios jugarán?", 0,
				TicTacToe.NUM_PLAYERS).read();
		colocateControllerFactory.setNumPlayers(numPlayers);
		board.write();
	}


}
