package ticTacToe.version180;

public abstract class ColocateController extends Controller {

	protected Turn turn;
	
	protected String title;
	
	protected ColocateController(Board board, Turn turn, String title) {
		super(board);
		assert turn != null;
		this.turn = turn;
		this.title = title;
	}

	protected void put(Color color, String title, Coordinate forbidden) {
		assert color != null;
		assert title != null;
		IO io = new IO();
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			target.read(title);
			ok = board.empty(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
			if (forbidden != null) {
				ok = !target.equals(forbidden);
			}
			if (!ok) {
				io.writeln("No se puede poner de donde se quitó");
			}
		} while (!ok);
		board.put(target, color);
	}

	protected void put(Color color, String title) {
		assert color != null;
		assert title != null;
		this.put(color, title, null);
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
