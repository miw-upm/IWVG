package ticTacToe.version11;

public class ColocateControllerFactory {

	private int manual;

	public void set(int manual) {
		this.manual = manual;
	}

	public ColocateController createPutController(Turn turn, Board board,
			Player player) {
		if (manual == 2 || manual == 1 && turn.take() == 0) {
			return new ManualPutController(board, player);
		} else {
			return new AutomaticPutController(board, player);
		}
	}

	public ColocateController createMoveController(Turn turn, Board board,
			Player player) {
		if (manual == 2 || manual == 1 && turn.take() == 0) {
			return new ManualMoveController(board, player);
		} else {
			return new AutomaticMoveController(board, player);
		}
	}
}
