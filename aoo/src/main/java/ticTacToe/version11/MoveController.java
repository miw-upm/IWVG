package ticTacToe.version11;

public abstract class MoveController extends ColocateController{

	public MoveController(Board board, Player player) {
		super(board, player);
	}
	
	public abstract void control();
}
