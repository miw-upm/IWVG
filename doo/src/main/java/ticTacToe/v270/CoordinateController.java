package ticTacToe.v270;

public abstract class CoordinateController extends GameController {

	protected CoordinateController(Game game) {
		super(game);
	}

	public abstract TicTacToeCoordinate getOrigin();
	
	public abstract TicTacToeCoordinate getTarget(String targetTitle);


}
