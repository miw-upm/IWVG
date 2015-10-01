package ticTacToe.version210;

public abstract class PutController extends ColocateController {

	protected PutController(Board board, Turn turn) {
		super(board, turn);
	}
	
	public void put(Coordinate target) {
		board.put(target, Color.values()[turn.take()]);
	}

}
