package ticTacToe.version3;

public class Board {

	private char[][] tokens;
	
	private static int[][] SQUARE_MAGIC = {{2,7,6},{9,5,1},{4,3,8}};

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
		int acum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tokens[i][j] == token) {
					acum += Board.SQUARE_MAGIC[i][j];
				}
			}
		}
		return acum == 15;
	}

	public boolean empty(Coordinate coordinate) {
		return tokens[coordinate.getRow()][coordinate.getColumn()] == '_';
	}

	public void put(Coordinate coordinate, char token) {
		tokens[coordinate.getRow()][coordinate.getColumn()] = token;
	}

	public boolean full(Coordinate coordinate, char token) {
		return tokens[coordinate.getRow()][coordinate.getColumn()] == token;
	}

}

