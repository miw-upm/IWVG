package ticTacToe.version230;

public class AutomaticPutController extends PutController {

	protected AutomaticPutController(Board board, Turn turn) {
		super(board, turn);
	}

	public Coordinate getTarget() {
		Coordinate target;
		do {
			target = Coordinate.random();
		} while (!board.empty(target));
		return target;
	}
	
	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
