package ticTacToe.version10;

public class PutController extends ColocateController {

	public PutController(Board board, Player player) {
		super(board, player, "Pone");

	}

	public void control() {
		io.writeln(title);
		super.control("En", null);
	}
}
