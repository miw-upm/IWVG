package ticTacToe.version4;

public class Board {

	private char[][] tokens;

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
		int[] countRow = new int[3];
		int[] countColumn = new int[3];
		int countMainDiagonal = 0;
		int countInverseDiagonal = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tokens[i][j] != token) {
					countRow[i]++;
					countColumn[j]++;
					if (i - j == 0) {
						countMainDiagonal++;
					}
					if (i + j == 2) {
						countInverseDiagonal++;
					}
				}
			}
		}
		if (countMainDiagonal==3 || countInverseDiagonal==3){
			return true;
		}
		for(int k=0; k<3; k++){
			if(countRow[k]==3 || countColumn[k]==3){
				return true;
			}
		}
		return false;
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
