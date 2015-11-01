package ticTacToe.v140;

public class Board {

	private Color[][] colors;

	public static final int DIMENSION = 3;

	public Board() {
		colors = new Color[Board.DIMENSION][Board.DIMENSION];
		for (Color[] row : colors) {
			for (int j=0; j<Board.DIMENSION; j++) {
				row[j] = Color.NONE;
			}
		}
	}

	public void write() {
		IO io = new IO();
		for (Color[] row : colors) {
			for (Color color : row) {
				io.write(color + " ");
			}
			io.writeln();
		}
	}

	public boolean complete() {
		int contTokens = 0;
		for (Color[] row : colors) {
			for (Color color : row) {
				if (color != Color.NONE) {
					contTokens++;
				}
			}
		}
		return contTokens == Board.DIMENSION * TicTacToe.NUM_PLAYERS;
	}

	public boolean existTicTacToe() {
		return this.existTicTacToe(Color.XS) || this.existTicTacToe(Color.OS);
	}

	private boolean existTicTacToe(Color color) {
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

	public boolean empty(Coordinate coordinate) {
		return this.full(coordinate, Color.NONE);
	}

	public void put(Coordinate coordinate, Color color) {
		colors[coordinate.getRow()][coordinate.getColumn()] = color;
	}

	public void remove(Coordinate coordinate) {
		this.put(coordinate, Color.NONE);
	}

	public boolean full(Coordinate coordinate, Color color) {
		return colors[coordinate.getRow()][coordinate.getColumn()] == color;
	}

}
