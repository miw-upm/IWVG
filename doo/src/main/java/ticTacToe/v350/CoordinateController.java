package ticTacToe.v350;

public abstract class CoordinateController extends GameController {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract TicTacToeCoordinate getOrigin();
	
	public abstract TicTacToeCoordinate getTarget(String targetTitle);


}
