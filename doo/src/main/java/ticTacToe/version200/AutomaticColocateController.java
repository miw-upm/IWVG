package ticTacToe.version200;

public abstract class AutomaticColocateController extends ColocateController {

	protected AutomaticColocateController(Board board, Turn turn, String title) {
		super(board, turn, title);
	}
	
	public void put(Color color, Coordinate forbidden){
		Coordinate target;
		boolean ok;
		do {
			target = Coordinate.random();
			ok = board.empty(target);
			if (ok && forbidden != null) {
				ok = !target.equals(forbidden);
			}
		} while (!ok);
		IO io = new IO();
		io.writeln("Se va a colocar un " + color.getValue() + " en " + target);
		io.readString("Pulse <Enter> para continuar");
		board.put(target, color);
	}
	
}
