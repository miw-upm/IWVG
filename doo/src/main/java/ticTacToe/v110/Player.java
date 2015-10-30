package ticTacToe.v110;

public class Player {

	Color token;

	public Player(int i) {
		token = Color.values()[i];
	}

	public void put(Board board) {
		IO io = new IO();
		io.writeln("Pone el jugador " + token);
		int row;
		int column;
		boolean ok;
		do {
			io.writeln("En qué casilla?");
			do {
				row = io.readInt("Fila? [1,"+Board.DIMENSION+"]: ");
			} while (row < 1 || Board.DIMENSION < row);
			do {
				column = io.readInt("Columna? [1,"+Board.DIMENSION+"]: ");
			} while (column < 1 || Board.DIMENSION < column);
			ok = board.empty(row-1, column-1);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(row-1, column-1, token);
	}

	public void move(Board board) {
		IO io = new IO();
		io.writeln("Mueve el jugador " + token);
		int originRow;
		int originColumn;
		int targetRow;
		int targetColumn;
		boolean ok;
		do {
			io.writeln("De qué casilla?");
			do {
				originRow = io.readInt("Fila? [1,"+Board.DIMENSION+"]: ");
			} while (originRow < 1 || Board.DIMENSION < originRow);
			do {
				originColumn = io.readInt("Columna? [1,"+Board.DIMENSION+"]: ");
			} while (originColumn < 1 || Board.DIMENSION < originColumn);
			ok = board.full(originRow-1, originColumn-1, token);
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			io.writeln("A qué casilla?");
			do {
				targetRow = io.readInt("Fila? [1,"+Board.DIMENSION+"]: ");
			} while (targetRow < 1 || Board.DIMENSION < targetRow);
			do {
				targetColumn = io.readInt("Columna? [1,"+Board.DIMENSION+"]: ");
			} while (targetColumn < 1 || Board.DIMENSION < targetColumn);
			ok = board.empty(targetRow-1, targetColumn-1);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.remove(originRow-1, originColumn-1);
		board.put(targetRow-1, targetColumn-1, token);
	}

	public void win() {
		new IO().writeln("Victoria!!!! " + token + "! " + token + "! " + token + "! Victoria!!!!");		
	}

}
