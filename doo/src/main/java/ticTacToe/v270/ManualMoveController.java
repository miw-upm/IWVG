package ticTacToe.v270;

public class ManualMoveController extends MoveController {

	public ManualMoveController(Game game) {
		super(game);
	}

	@Override
	protected TicTacToeCoordinate selectOrigin() {
		TicTacToeCoordinate origin = new TicTacToeCoordinate();
		origin.read("De");
		return origin;
	}

	@Override
	protected TicTacToeCoordinate selectTarget(String targetTitle) {
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		target.read(targetTitle);
		return target;
	}

}
