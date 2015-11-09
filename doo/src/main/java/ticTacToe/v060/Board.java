package ticTacToe.v060;

public class Board {

	private Token[][] tokens;

	private static char[] COLOR = { 'x', 'o' };

	public Board() {
		tokens = new Token[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = new Token('_');
			}
		}
	}

	public void write() {
		IO io = new IO();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				io.write(tokens[i][j].getValue() + " ");
			}
			io.writeln();
		}
	}

	public boolean complete() {
		int contTokens = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!tokens[i][j].equals(new Token('_'))) {
					contTokens++;
				}
			}
		}
		return contTokens == 6;
	}

	public boolean existTicTacToe() {
		return this.existTicTacToe(new Token('x'))
				|| this.existTicTacToe(new Token('o'));
	}

	public boolean existTicTacToe(Token token) {
		if (tokens[1][1].equals(token)) {
			if (tokens[0][0].equals(token)) {
				return tokens[2][2].equals(token);
			}
			if (tokens[0][2].equals(token)) {
				return tokens[2][0].equals(token);
			}
			if (tokens[0][1].equals(token)) {
				return tokens[2][1].equals(token);
			}
			if (tokens[1][0].equals(token)) {
				return tokens[1][2].equals(token);
			}
			return false;
		}
		if (tokens[0][0].equals(token)) {
			if (tokens[0][1].equals(token)) {
				return tokens[0][2].equals(token);
			}
			if (tokens[1][0].equals(token)) {
				return tokens[2][0].equals(token);
			}
			return false;
		}
		if (tokens[2][2].equals(token)) {
			if (tokens[1][2].equals(token)) {
				return tokens[0][2].equals(token);
			}
			if (tokens[2][1].equals(token)) {
				return tokens[2][0].equals(token);
			}
			return false;
		}
		return false;
	}

	public boolean empty(int row, int column) {
		return tokens[row][column].equals(new Token('_'));
	}

	public void put(int turn) {
		IO io = new IO();
		io.writeln("Pone el jugador " + Board.COLOR[turn]);
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
			ok = this.empty(row - 1, column - 1);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		tokens[row - 1][column - 1] = new Token(Board.COLOR[turn]);
	}

	public void move(int turn) {
		IO io = new IO();
		io.writeln("Mueve el jugador " + Board.COLOR[turn]);
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
			} while (1 <= originColumn && originColumn <= 3);
			ok = this.full(originRow - 1, originColumn - 1, new Token(
					Board.COLOR[turn]));
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
			ok = this.empty(targetRow - 1, targetColumn - 1);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		tokens[originRow - 1][originColumn - 1] = new Token('_');
		tokens[targetRow - 1][targetColumn - 1] = new Token(Board.COLOR[turn]);
	}

	public boolean full(int row, int column, Token token) {
		return tokens[row][column].equals(token);
	}

	public void clear() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = new Token('_');
			}
		}
	}

	public void win(int turn) {
		new IO().writeln("Victoria!!!! " + Board.COLOR[turn] + "! "
				+ Board.COLOR[turn] + "! " + Board.COLOR[turn]
				+ "! Victoria!!!!");
	}

}
