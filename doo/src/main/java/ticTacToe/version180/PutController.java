package ticTacToe.version180;

public class PutController extends ColocateController {
	
	protected PutController(Board board, Turn turn){
		super(board, turn, "Pone");
	}
	
	protected void colocate() {
		this.put(Color.values()[turn.take()], "En");
	}
}
