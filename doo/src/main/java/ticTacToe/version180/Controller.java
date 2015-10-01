package ticTacToe.version180;

public abstract class Controller {
	
	protected Board board;
	
	protected Controller(Board board){
		assert board != null;
		this.board = board;
	}
	
	public abstract void control();

}
