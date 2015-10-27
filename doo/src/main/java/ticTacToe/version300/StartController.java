package ticTacToe.version300;

public class StartController extends Controller {

	ColocateControllerFactory colocateControllerFactory;
	
	protected StartController(Board board, Turn turn, ColocateControllerFactory colocateControllerFactory) {
		super(board, turn);
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void control(int numPlayers) {
		colocateControllerFactory.setNumPlayers(numPlayers);
	}

}
