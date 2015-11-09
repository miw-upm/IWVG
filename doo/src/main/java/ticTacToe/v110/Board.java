package ticTacToe.v110;

public class Board {

	private char[][] tokens;

	private static char[] COLOR = { 'x', 'o' };

	public Board() {
		tokens = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = '_';
			}
		}
	}

	public void write() {
		IO io = new IO();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				io.write(tokens[i][j] + " ");
			}
			io.writeln();
		}
	}

	public boolean complete() {
		int contTokens = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tokens[i][j] != '_') {
					contTokens++;
				}
			}
		}
		return contTokens == 6;
	}

	public boolean existTicTacToe() {
		return this.existTicTacToe('x') || this.existTicTacToe('o');
	}

	public boolean existTicTacToe(char token) {
		if (tokens[1][1] == token) {
			if (tokens[0][0] == token) {
				return tokens[2][2] == token;
			}
			if (tokens[0][2] == token) {
				return tokens[2][0] == token;
			}
			if (tokens[0][1] == token) {
				return tokens[2][1] == token;
			}
			if (tokens[1][0] == token) {
				return tokens[1][2] == token;
			}
			return false;
		}
		if (tokens[0][0] == token) {
			if (tokens[0][1] == token) {
				return tokens[0][2] == token;
			}
			if (tokens[1][0] == token) {
				return tokens[2][0] == token;
			}
			return false;
		}
		if (tokens[2][2] == token) {
			if (tokens[1][2] == token) {
				return tokens[0][2] == token;
			}
			if (tokens[2][1] == token) {
				return tokens[2][0] == token;
			}
			return false;
		}
		return false;
	}

	public boolean empty(int row, int column) {
		return tokens[row][column] == '_';
	}

	public void put(int row, int column, char token) {
		tokens[row][column] = token;
	}

	public void remove(int row, int column) {
		tokens[row][column] = '_';
	}

	public boolean full(int row, int column, char token) {
		return tokens[row][column] == token;
	}

	public void win(int turn) {
		new IO().writeln("Victoria!!!! " + Board.COLOR[turn] + "! "
				+ Board.COLOR[turn] + "! " + Board.COLOR[turn]
				+ "! Victoria!!!!");
	}

}
