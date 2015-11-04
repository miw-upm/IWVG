package ticTacToe.v270;

public class RandomPutController extends PutController {

	public RandomPutController(Game game) {
		super(game);
	}

	@Override
	protected TicTacToeCoordinate selectTarget(String targetTitle) {
		TicTacToeCoordinate target = new TicTacToeCoordinate();
		boolean ok;
		do {
			target.random();
			ok = this.getGame().getBoard().empty(target);
		} while (!ok);
		new IO().writeln("La máquina pone en " + target);
		new IO().readString("Enter para continuar!");
		TicTacToeCoordinate result = target;
		target = null;
		return result;
	}

}
