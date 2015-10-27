package chess;

public class Controller {
	
	private Board board;
	
	private Turn turn;

	public Controller(Board board, Turn turn) {
		this.board = board;
		this.turn = turn;
	}

	public String getColor() {
		return Color.values()[turn.take()].getName();
	}

	public boolean isPosibleToMove(Coordinate origin) {
		// TODO Auto-generated method stub
		return false;
	}

	public void move(Coordinate origin, Coordinate target) {
		// TODO Auto-generated method stub
		
	}

	public void enrocar() {
		// TODO Auto-generated method stub
		
	}

	public boolean isPosibleToEnroque() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean castlingIsPosible(Side side) {
		// TODO Auto-generated method stub
		return false;
	}

}
