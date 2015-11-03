package ticTacToe.v270;

public class RandomCoordinateController extends CoordinateController {

	private TicTacToeCoordinate origin;
	
	private TicTacToeCoordinate target;
	
	protected RandomCoordinateController(Game game) {
		super(game);
	}

	@Override
	public TicTacToeCoordinate getOrigin() {
		origin = new TicTacToeCoordinate();
		boolean ok;
		do {
			origin.random();
			ok = this.getGame().getBoard().full(origin, this.getTurn().take());
		} while (!ok);
		new IO().writeln("La máquina quita de "+ origin);
		new IO().readString("Enter para continuar!");
		TicTacToeCoordinate result = origin;
		origin = null;
		return result;
	}

	@Override
	public TicTacToeCoordinate getTarget(String targetTitle) {
		target = new TicTacToeCoordinate();
		boolean ok;
		do {
			target.random();
			ok = this.getGame().getBoard().empty(target);
			if (ok) {
				if (origin != null) {
					ok = !origin.equals(target);
				}
			}
		} while (!ok);
		new IO().writeln("La máquina pone en "+ target);
		new IO().readString("Enter para continuar!");
		TicTacToeCoordinate result = target;
		target = null;
		return result;
	}
	
}
