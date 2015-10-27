package ticTacToe.version300;

public abstract class MoveController extends ColocateController {

	protected MoveController(Board board, Turn turn) {
		super(board, turn);
	}

	public void put(Coordinate target) {
		board.put(target, Color.values()[turn.take()]);
	}
	
	public void remove(Coordinate origin) {
		board.remove(origin, Color.values()[turn.take()]);		
	}
	
}
