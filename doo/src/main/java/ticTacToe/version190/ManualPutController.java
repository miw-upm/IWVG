package ticTacToe.version190;

public class ManualPutController extends ManualColocateController implements PutController {
	
	protected ManualPutController(Board board, Turn turn){
		super(board, turn, "Pone");
	}
	
	protected void colocate() {
		this.put(Color.values()[turn.take()], "En");
	}
}
