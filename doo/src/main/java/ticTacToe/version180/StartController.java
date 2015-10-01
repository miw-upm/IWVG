package ticTacToe.version180;

public class StartController extends Controller {
	
	protected StartController(Board board){
		super(board);
	}
	
	public void control() {
		board.write();
	}

}
