package ticTacToe.v130;

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
		return this.existTicTacToe(Board.COLOR[0]) || this.existTicTacToe('o');
	}

	private boolean existTicTacToe(char color) {
		if (tokens[1][1] == color) {
			if (tokens[0][0] == color) {
				return tokens[2][2] == color;
			}
			if (tokens[0][2] == color) {
				return tokens[2][0] == color;
			}
			if (tokens[0][1] == color) {
				return tokens[2][1] == color;
			}
			if (tokens[1][0] == color) {
				return tokens[1][2] == color;
			}
			return false;
		}
		if (tokens[0][0] == color) {
			if (tokens[0][1] == color) {
				return tokens[0][2] == color;
			}
			if (tokens[1][0] == color) {
				return tokens[1][2] == color;
			}
			return false;
		}
		if (tokens[2][2] == color) {
			if (tokens[1][2] == color) {
				return tokens[0][2] == color;
			}
			if (tokens[2][1] == color) {
				return tokens[2][0] == color;
			}
			return false;
		}
		return false;
	}

	public boolean empty(Coordinate coordinate) {
		return this.full(coordinate, '_');
	}

	public void put(Coordinate coordinate, char color) {
		tokens[coordinate.getRow()][coordinate.getColumn()] = color;
	}

	public void remove(Coordinate coordinate) {
		this.put(coordinate, '_');
	}

	public boolean full(Coordinate coordinate, char color) {
		return tokens[coordinate.getRow()][coordinate.getColumn()] == color;
	}

}
