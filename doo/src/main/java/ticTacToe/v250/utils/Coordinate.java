package ticTacToe.v250.utils;


public class Coordinate {

	private int row;
	
	private int column;
	
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
		return Direction.NON_EXISTENT;
	}
	
	public boolean inRow(Coordinate coordinate){
		return row == coordinate.row;
	}
	
	public boolean inColumn(Coordinate coordinate){
		return column == coordinate.column;
	}
	
	public boolean inDiagonal(){
		return row - column == 0;
	}	
	
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public void setRow(int row){
		this.row = row;
	}
	
	public void setColumn(int column){
		this.column = column;
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
