package ticTacToe.v280;

public abstract class CoordinateController extends Controller {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract TicTacToeCoordinate getOrigin();
	
	public abstract TicTacToeCoordinate getTarget(String targetTitle);


}
