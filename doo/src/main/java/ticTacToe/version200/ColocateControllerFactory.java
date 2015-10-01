package ticTacToe.version200;

public class ColocateControllerFactory {

	private Board board;

	private Turn turn;
	
	private ColocateController[] putControllers;

	private ColocateController[] moveControllers;

	
	public ColocateControllerFactory(Board board, Turn turn) {
		assert board != null;
		assert turn != null;
		this.board = board;
		this.turn = turn;
		putControllers = new ColocateController[TicTacToe.NUM_PLAYERS];
		moveControllers = new ColocateController[TicTacToe.NUM_PLAYERS];
	}
	
	public void setNumPlayers(int numPlayers){
		for (int i = 0; i < TicTacToe.NUM_PLAYERS; i++) {
			if (i < numPlayers) {
				putControllers[i] = new ManualPutController(board, turn);
				moveControllers[i] = new ManualMoveController(board, turn);
			} else {
				putControllers[i] = new AutomaticPutController(board, turn);
				moveControllers[i] = new AutomaticMoveController(board, turn);
			}
		}
	}
	
	public ColocateController getColocateController() {
		ColocateController colocateController;
		if (!board.complete()) {
			colocateController = putControllers[turn.take()];
		} else {
			colocateController = moveControllers[turn.take()];
		}
		return colocateController;
	}

}
