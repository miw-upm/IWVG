package ticTacToe.version11;

public class Coordinate {

	private int row;
	
	private int column;
	
	public Coordinate() {
	}
	
	public Coordinate(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public void read() {
		IO io = new IO();
		do {
			row = io.readInt("Fila? [1,3]: ");
		} while (row < 1 || 3 < row);
		row--;
		do {
			column = io.readInt("Columna? [1,3]: ");
		} while (column < 1 || 3 < column);
		column--;
	}
	
	

	@Override
	public String toString() {
		return "[" + row + ", " + column + "]";
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
}
