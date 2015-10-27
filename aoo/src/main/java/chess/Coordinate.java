package chess;

import java.util.Random;

public class Coordinate {

	private int row;
	
	private int column;
	
	private static final ClosedInterval LIMITS = new ClosedInterval(0, Board.DIMENSION-1);

	public Coordinate(){	
	}
	
	public Coordinate(int row, int column){	
		assert LIMITS.includes(row);
		assert LIMITS.includes(column);
		this.row = row;
		this.column = column;
	}
	
	public void read(String title) {
		assert title != null;
		IO io = new IO();
		io.writeln(title + " qué casilla?");
		row = new LimitedIntDialog("Fila?", Board.DIMENSION).read()-1;
		column = new LimitedIntDialog("Columna?", Board.DIMENSION).read()-1;
	}
	
	private boolean inDiagonal(){
		return row - column == 0;
	}
	
	private boolean inInverse(){
		return row + column == Board.DIMENSION-1;
	}
	
	public static Coordinate random() {
		Random random = new Random(System.currentTimeMillis());
		return new Coordinate(random.nextInt(Board.DIMENSION), random.nextInt(Board.DIMENSION));
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + row;
		return result;
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

	@Override
	public String toString() {
		return "(" + (row+1) + ", " + (column+1) + ")";
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
}
