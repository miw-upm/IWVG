package ticTacToe.version210;

public class AutomaticMoveController extends MoveController {

	protected AutomaticMoveController(Board board, Turn turn){
		super(board, turn);
	}

	public Coordinate getOrigin() {
		Coordinate origin;
		do {
			origin = Coordinate.random();
		} while (!board.full(origin, this.getColor()));
		return origin;
	}

	public Coordinate getTarget(Coordinate forbidden) {
		Coordinate target;
		boolean ok;
		do {
			target = Coordinate.random();
			ok = board.empty(target);
			if (ok) {
				ok = !target.equals(forbidden);
			}
		} while (!ok);
		return target;
	}

}
