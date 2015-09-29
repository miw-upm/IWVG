package ticTacToe.version11;

public abstract class ColocateController {

	protected Board board;
	
	protected Player player;
	
	public ColocateController(Board board, Player player) {
		this.board = board;
		this.player = player;
	}
	
	public abstract void control();
}
