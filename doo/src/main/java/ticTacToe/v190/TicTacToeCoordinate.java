package ticTacToe.v190;

public class TicTacToeCoordinate extends Coordinate {

	public static final int DIMENSION = 3;
	
	private static final ClosedInterval LIMITS = new ClosedInterval(0, TicTacToeCoordinate.DIMENSION-1);

	public TicTacToeCoordinate(){	
	}
	
	public TicTacToeCoordinate(int row, int column){	
		this.setRow(row);
		this.setColumn(column);
	}
	
	public void setRow(int row){
		assert LIMITS.includes(row);
		super.setRow(row);
	}
	
	public void setColumn(int column){
		assert LIMITS.includes(column);
		super.setColumn(column);
	}
	
	public void read(String title) {
		assert title != null;
		IO io = new IO();
		io.writeln(title + " qué casilla?");
		this.setRow(new LimitedIntDialog("Fila?", TicTacToeCoordinate.DIMENSION).read()-1);
		this.setColumn(new LimitedIntDialog("Columna?", TicTacToeCoordinate.DIMENSION).read()-1);
	}
	
	public Direction direction(TicTacToeCoordinate coordinate){
		Direction direction = super.direction(coordinate);
		if (direction == Direction.NON_EXISTENT) {
			if(this.inInverse() && coordinate.inInverse())
				return Direction.INVERSE;
		}
		return direction;
	}
	
	private boolean inInverse(){
		return this.getRow() + this.getColumn() == TicTacToeCoordinate.DIMENSION-1;
	}
	
}
