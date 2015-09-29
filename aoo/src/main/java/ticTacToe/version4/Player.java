package ticTacToe.version4;

public class Player {

	char token;

	public Player(int i) {
		if (i == 0) {
			token = 'x';
		} else {
			token = 'o';
		}
	}

	public void put(Board board) {
		IO io = new IO();
		io.writeln("Pone el jugador " + token);
		Coordinate coordinate = new Coordinate();
		boolean ok;
		do {
			io.writeln("En qué casilla?");
			coordinate.read();
			ok = board.empty(coordinate);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(coordinate, token);
	}

	public void move(Board board) {
		IO io = new IO();
		io.writeln("Mueve el jugador " + token);
		Coordinate origin = new Coordinate();
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			io.writeln("De qué casilla?");
			origin.read();
			ok = board.full(origin, token);
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			io.writeln("A qué casilla?");
			target.read();
			ok = board.empty(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(origin, '_');
		board.put(target, token);
	}

	public void win() {
		new IO().writeln("Victoria!!!! " + token + "! " + token + "! " + token + "!!!!! Victoria!!!!");		
	}

}
