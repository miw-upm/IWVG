package ticTacToe.v130;

public class Coordinate {

	private int row;
	
	private int column;

	public void read(String title) {
		IO io = new IO();
		io.writeln(title + " qué casilla?");
		row = new LimitedIntDialog("Fila?", 3).read()-1;
		column = new LimitedIntDialog("Columna?", 3).read()-1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (column != other.column)
			return false;
		if (row != other.row)
			return false;
		return true;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}	
}
