package ticTacToe.version300;

public abstract class ColocateController extends Controller {
	
	protected ColocateController(Board board, Turn turn) {
		super(board, turn);
	}
	
	public Color getColor() {
		return Color.values()[turn.take()];
	}
	
	public boolean isGameOver() {
		return board.existTicTacToe(Color.values()[turn.take()]);
	}

	public void close() {
		turn.change();		
	}
	
	public abstract void recibir(View gameView) ;
}
