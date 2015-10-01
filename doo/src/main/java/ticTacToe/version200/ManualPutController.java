package ticTacToe.version200;

public class ManualPutController extends ManualColocateController {
	
	protected ManualPutController(Board board, Turn turn){
		super(board, turn, "Pone");
	}
	
	protected void colocate() {
		this.put(Color.values()[turn.take()], "En");
	}
}
