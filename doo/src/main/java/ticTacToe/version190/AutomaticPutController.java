package ticTacToe.version190;

public class AutomaticPutController extends AutomaticColocateController implements PutController {

	protected AutomaticPutController(Board board, Turn turn){
		super(board, turn, "Pone");
	}
	
	protected void colocate(){
		this.put(Color.values()[turn.take()], null);
	}
	

}
