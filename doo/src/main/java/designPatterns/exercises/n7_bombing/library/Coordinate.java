package designPatterns.exercises.n7_bombing.library;

public class Coordinate {

	private int row;
	
	private int column;
	
	public Coordinate(int row, int column){
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return "Coordinate [row=" + row + ", column=" + column + "]";
	}
	
	
}
