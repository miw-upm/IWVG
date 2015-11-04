package ticTacToe.v270;

public class RandomMoveController extends MoveController {

	public RandomMoveController(Game game) {
		super(game);
	}

	@Override
	protected TicTacToeCoordinate selectOrigin() {
		TicTacToeCoordinate origin = new TicTacToeCoordinate();
		boolean ok;
		do {
			origin.random();
			ok = this.getGame().getBoard().full(origin, this.getTurn().take());
		} while (!ok);
		new IO().writeln("La máquina quita de " + origin);
		new IO().readString("Enter para continuar!");
		TicTacToeCoordinate result = origin;
		origin = null;
		return result;
	}

	@Override
	protected TicTacToeCoordinate selectTarget(String targetTitle) {
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		boolean ok;
		do {
			target.random();
			ok = this.getGame().getBoard().empty(target);
			if (ok) {
				if (this.getOrigin() != null) {
					ok = !this.getOrigin().equals(target);
				}
			}
		} while (!ok);
		new IO().writeln("La máquina pone en " + target);
		new IO().readString("Enter para continuar!");
		TicTacToeCoordinate result = target;
		target = null;
		return result;
	}

}
