package ticTacToe.version170;

public class PutController {
	
	public void put(Board board, Turn turn) {
		assert board != null;
		assert turn != null;
		Color color = Color.values()[turn.take()];
		IO io = new IO();
		io.writeln("Pone el jugador " + color);
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
	
	private void colocate(Board board, Color color){
		this.put(board, color, "En", null);
	}
	
	private void put(Board board, Color color, String title, Coordinate forbidden) {
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
