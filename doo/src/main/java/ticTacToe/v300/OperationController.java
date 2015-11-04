package ticTacToe.v300;

public abstract class OperationController extends Controller {

	protected OperationController(Game game) {
		super(game);
	}

	public abstract void control();
	
}
