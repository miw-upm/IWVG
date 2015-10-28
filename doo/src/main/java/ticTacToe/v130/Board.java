package ticTacToe.v130;

public class Board {

	private Color[][] colors;

	public static final int DIMENSION = 3;

	public Board() {
		colors = new Color[Board.DIMENSION][Board.DIMENSION];
		for (int i = 0; i < Board.DIMENSION; i++) {
			for (int j = 0; j < Board.DIMENSION; j++) {
				colors[i][j] = Color.NONE;
			}
		}
	}

	public void write() {
		IO io = new IO();
		for (int i = 0; i < Board.DIMENSION; i++) {
			for (int j = 0; j < Board.DIMENSION; j++) {
				io.write(colors[i][j].getValue() + " ");
			}
			io.writeln();
		}
	}

	public boolean complete() {
		int contTokens = 0;
		for (int i = 0; i < Board.DIMENSION; i++) {
			for (int j = 0; j < Board.DIMENSION; j++) {
				if (colors[i][j] != Color.NONE) {
					contTokens++;
				}
			}
		}
		return contTokens == Board.DIMENSION * TicTacToe.NUM_PLAYERS;
	}

	public boolean existTicTacToe() {
		return this.existTicTacToe(Color.XS) || this.existTicTacToe(Color.OS);
	}

	public boolean existTicTacToe(Color color) {
		if (colors[1][1] == color) {
			if (colors[0][0] == color) {
				return colors[2][2] == color;
			}
			if (colors[0][2] == color) {
				return colors[2][0] == color;
			}
			if (colors[0][1] == color) {
				return colors[2][1] == color;
			}
			if (colors[1][0] == color) {
				return colors[1][2] == color;
			}
			return false;
		}
		if (colors[0][0] == color) {
			if (colors[0][1] == color) {
				return colors[0][2] == color;
			}
			if (colors[1][0] == color) {
				return colors[1][2] == color;
			}
			return false;
		}
		if (colors[2][2] == color) {
			if (colors[1][2] == color) {
				return colors[0][2] == color;
			}
			if (colors[2][1] == color) {
				return colors[2][0] == color;
			}
			return false;
		}
		return false;
	}

	public boolean empty(int row, int column) {
		return colors[row][column] == Color.NONE;
	}

	public void put(int row, int column, Color color) {
		colors[row][column] = color;
	}

	public void remove(int row, int column) {
		colors[row][column] = Color.NONE;
	}

	public boolean full(int row, int column, Color color) {
		return colors[row][column] == color;
	}

}
