package ticTacToe.version11;

public class ColocateControllerFactory {

	private int manual;

	public void set(int manual) {
		this.manual = manual;
	}

	public ColocateController createColocateController(Turn turn, Board board,
			Player player) {
		if (manual == 2 || manual == 1 && turn.take() == 0) {
			if (!board.complete()) {
				return new ManualPutController(board, player);
			} else {
				return new ManualMoveController(board, player);
			}
		} else {
			if (!board.complete()) {
			return new AutomaticPutController(board, player);
			} else {
				return new AutomaticMoveController(board, player);
			}
		}
	}
	
}
