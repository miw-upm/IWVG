package ticTacToe.version170;

public class MoveController {
	
	public void move(Board board, Turn turn) {
		assert board != null;
		assert turn != null;
		Color color = Color.values()[turn.take()];
		IO io = new IO();
		io.writeln("Pone el jugador " + Color.values()[turn.take()]);
		this.colocate(board, color);
		board.write();
		if (board.existTicTacToe(color)) {
			io.writeln("Victoria!!!! " 
					+ Color.values()[turn.take()] + "! "
					+ Color.values()[turn.take()] + "! "
					+ Color.values()[turn.take()] + "! Victoria!!!!");
		} else {
			turn.change();
		}
	}
	
	private void colocate(Board board, Color color) {
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			origin.read("De");
			ok = board.full(origin, color);
			if (!ok) {
				new IO().writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		board.remove(origin, color);
		this.put(board, color, "A", origin);
	}
	
	protected void put(Board board, Color color, String title, Coordinate forbidden) {
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
}
