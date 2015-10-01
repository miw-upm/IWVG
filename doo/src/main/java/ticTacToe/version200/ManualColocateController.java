package ticTacToe.version200;

public abstract class ManualColocateController extends ColocateController {

	protected ManualColocateController(Board board, Turn turn, String title) {
		super(board, turn, title);
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
			if (ok && forbidden != null) {
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

}
