package ticTacToe.v100;

public class Player {

	char color;

	public Player(int i) {
		if (i == 0) {
			color = 'x';
		} else {
			color = 'o';
		}
	}

	public void put(Board board) {
		IO io = new IO();
		io.writeln("Pone el jugador " + color);
		int row;
		int column;
		boolean ok;
		do {
			io.writeln("En qué casilla?");
			do {
				row = io.readInt("Fila? [1,3]: ");
			} while (row < 1 || 3 < row);
			do {
				column = io.readInt("Columna? [1,3]: ");
			} while (column < 1 || 3 < column);
			ok = board.empty(row - 1, column - 1);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(row - 1, column - 1, color);
	}

	public void move(Board board) {
		IO io = new IO();
		io.writeln("Mueve el jugador " + color);
		int originRow;
		int originColumn;
		int targetRow;
		int targetColumn;
		boolean ok;
		do {
			io.writeln("De qué casilla?");
			do {
				originRow = io.readInt("Fila? [1,3]: ");
			} while (originRow < 1 || 3 < originRow);
			do {
				originColumn = io.readInt("Columna? [1,3]: ");
			} while (originColumn < 1 || 3 < originColumn);
			ok = board.full(originRow - 1, originColumn - 1, color);
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			io.writeln("A qué casilla?");
			do {
				targetRow = io.readInt("Fila? [1,3]: ");
			} while (targetRow < 1 || 3 < targetRow);
			do {
				targetColumn = io.readInt("Columna? [1,3]: ");
			} while (targetColumn < 1 || 3 < targetColumn);
			ok = board.empty(targetRow - 1, targetColumn - 1);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.remove(originRow - 1, originColumn - 1);
		board.put(targetRow - 1, targetColumn - 1, color);
	}

	public void win() {
		new IO().writeln("Victoria!!!! " + color + "! " + color + "! " + color
				+ "! Victoria!!!!");
	}

}
