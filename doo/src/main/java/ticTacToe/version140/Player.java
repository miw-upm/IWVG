package ticTacToe.version140;

public class Player {

	Color token;

	public Player(int i) {
		token = Color.values()[i];
	}

	public void put(Board board, String title, Coordinate forbidden) {
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
		board.put(target, token);
	}

	public void put(Board board, String title) {
		this.put(board, title, null);
	}

	public void put(Board board) {
		IO io = new IO();
		io.writeln("Pone el jugador " + token);
		this.put(board, "En");
	}

	public void move(Board board) {
		IO io = new IO();
		io.writeln("Mueve el jugador " + token);
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			origin.read("De");
			ok = board.full(origin, token);
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		board.remove(origin);
		this.put(board, "A", origin);
	}

	public void win() {
		new IO().writeln("Victoria!!!! " + token + "! " + token + "! " + token
				+ "! Victoria!!!!");
	}

}
