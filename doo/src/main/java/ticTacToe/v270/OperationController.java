package ticTacToe.v270;

public abstract class OperationController extends GameController {

	protected OperationController(Game game) {
		super(game);
	}

	public abstract void control();
	
}
