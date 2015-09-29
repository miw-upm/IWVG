package ticTacToe.version11;

public abstract class PutController extends ColocateController {

	public PutController(Board board, Player player) {
		super(board, player);
	}

	public abstract void control();
}
