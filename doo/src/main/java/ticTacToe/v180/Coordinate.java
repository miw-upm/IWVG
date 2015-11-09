package ticTacToe.v180;

public class Coordinate {

	private int row;
	
	private int column;
	
	public static final int DIMENSION = 3;
	
	private static final ClosedInterval LIMITS = new ClosedInterval(0, Coordinate.DIMENSION-1);

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
		row = new LimitedIntDialog("Fila?", Coordinate.DIMENSION).read()-1;
		column = new LimitedIntDialog("Columna?", Coordinate.DIMENSION).read()-1;
	}
	
	public Direction direction(Coordinate coordinate){
		assert coordinate != null;
		if (this.inRow(coordinate)){
			return Direction.HORIZONTAL;
		}
		if (this.inColumn(coordinate)){
			return Direction.VERTICAL;
		}
		if (this.inDiagonal() && coordinate.inDiagonal()){
			return Direction.DIAGONAL;
		}
		if (this.inInverse() && coordinate.inInverse()){
			return Direction.INVERSE;
		}
		return Direction.NON_EXISTENT;
	}
	
	public boolean inRow(Coordinate coordinate){
		return row == coordinate.row;
	}
	
	public boolean inColumn(Coordinate coordinate){
		return column == coordinate.column;
	}
	
	private boolean inDiagonal(){
		return row - column == 0;
	}
	
	private boolean inInverse(){
		return row + column == Coordinate.DIMENSION-1;
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
	
}
