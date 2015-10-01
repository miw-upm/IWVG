package ticTacToe.version210;

public abstract class Controller {
	
	protected Board board;
	
	protected Turn turn;
	
	protected Controller(Board board, Turn turn){
		assert board != null;
		assert turn != null;
		this.board = board;
		this.turn = turn;
	}

	public Board getBoard() {
		return board;
	}
	
}
