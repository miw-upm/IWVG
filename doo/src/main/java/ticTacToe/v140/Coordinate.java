package ticTacToe.v140;

public class Coordinate {

	private int row;
	
	private int column;
	
	public Coordinate(){	
	}
	
	public Coordinate(int row, int column){	
		this.row = row;
		this.column = column;
	}
	
	public void read(String title) {
		IO io = new IO();
		io.writeln(title + " qué casilla?");
		row = new LimitedIntDialog("Fila?", Board.DIMENSION).read()-1;
		column = new LimitedIntDialog("Columna?", Board.DIMENSION).read()-1;
	}
	
	public Direction direction(Coordinate coordinate){
		if (row==coordinate.row){
			return Direction.HORIZONTAL;
		}
		if (column==coordinate.column){
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
	
	private boolean inDiagonal(){
		return row - column == 0;
	}
	
	private boolean inInverse(){
		return row + column == Board.DIMENSION-1;
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
