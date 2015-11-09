package ticTacToe.v240;

public class PutController extends ColocateController {

	public PutController(Turn turn, Board board) {
		super(turn, board);
	}
	
	@Override
	public void control(){
		this.control("Pone", "En");
	}

	@Override
	protected void colocate(String targetTitle) {
		this.put(targetTitle);
	}

}
