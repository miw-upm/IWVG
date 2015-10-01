package ticTacToe.version200;

public class AutomaticPutController extends AutomaticColocateController {

	protected AutomaticPutController(Board board, Turn turn){
		super(board, turn, "Pone");
	}
	
	protected void colocate(){
		this.put(Color.values()[turn.take()], null);
	}
	

}
