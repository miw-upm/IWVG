package ticTacToe.v280.models;

import java.util.Random;

import ticTacToe.v280.utils.ClosedInterval;
import ticTacToe.v280.utils.Direction;
import ticTacToe.v280.utils.IO;
import ticTacToe.v280.utils.LimitedIntDialog;

public class Coordinate {
	
	private ticTacToe.v280.utils.Coordinate coordinate;

	public static final int DIMENSION = 3;
	
	private static final ClosedInterval LIMITS = new ClosedInterval(0, Coordinate.DIMENSION-1);

	public Coordinate(){
		coordinate = new ticTacToe.v280.utils.Coordinate();
	}
	
	public Coordinate(int row, int column){
		this();
		this.setRow(row);
		this.setColumn(column);
	}
	
	public Coordinate(Coordinate ticTacToeCoordinate) {
		this(ticTacToeCoordinate.coordinate.getRow(),
				ticTacToeCoordinate.coordinate.getColumn());
	}

	private void setRow(int row){
		assert LIMITS.includes(row);
		coordinate.setRow(row);
	}
	
	private void setColumn(int column){
		assert LIMITS.includes(column);
		coordinate.setColumn(column);
	}
	
	public void read(String title) {
		assert title != null;
		IO io = new IO();
		io.writeln(title + " qué casilla?");
		this.setRow(new LimitedIntDialog("Fila?", Coordinate.DIMENSION).read()-1);
		this.setColumn(new LimitedIntDialog("Columna?", Coordinate.DIMENSION).read()-1);
	}
	
	public void random() {
		Random random = new Random(System.currentTimeMillis());
		coordinate.setRow(random.nextInt(Coordinate.DIMENSION));
		coordinate.setColumn(random.nextInt(Coordinate.DIMENSION));
	}
	
	public Direction direction(Coordinate ticTacToeCoordinate){
		Direction direction = coordinate.direction(ticTacToeCoordinate.coordinate);
		if (direction == Direction.NON_EXISTENT) {
			if(this.inInverse() && ticTacToeCoordinate.inInverse())
				return Direction.INVERSE;
		}
		return direction;
	}
	
	private boolean inInverse(){
		return coordinate.getRow() + coordinate.getColumn() == Coordinate.DIMENSION-1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((coordinate == null) ? 0 : coordinate.hashCode());
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
		if (coordinate == null) {
			if (other.coordinate != null)
				return false;
		} else if (!coordinate.equals(other.coordinate))
			return false;
		return true;
	}
	
	public Coordinate clone() {
		return new Coordinate(this);
	}
	
	@Override
	public String toString(){
		return "[" + (coordinate.getRow()+1) + ", " + (coordinate.getColumn()+1) + "]";
	}
	
}
