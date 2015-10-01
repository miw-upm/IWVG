package ticTacToe.version200;

public abstract class ColocateController extends Controller {

	protected String title;
	
	protected ColocateController(Board board, Turn turn, String title) {
		super(board, turn);
		this.title = title;
	}
	
	public void control() {
		IO io = new IO();
		io.writeln(title + " el jugador " + Color.values()[turn.take()]);
		this.colocate();
		board.write();
		if (board.existTicTacToe(Color.values()[turn.take()])) {
			io.writeln("Victoria!!!! " 
					+ Color.values()[turn.take()] + "! "
					+ Color.values()[turn.take()] + "! "
					+ Color.values()[turn.take()] + "! Victoria!!!!");
		} else {
			turn.change();
		}
	}
	
	protected abstract void colocate();
}
