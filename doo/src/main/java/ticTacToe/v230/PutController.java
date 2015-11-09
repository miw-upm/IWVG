package ticTacToe.v230;

public class PutController extends ColocateController {

	public PutController(Turn turn, Board board) {
		super(turn, board);
	}
	
	@Override
	public void control(){
		this.put("Pone", "En");
	}

	@Override
	protected void prePut() {
	}

}
