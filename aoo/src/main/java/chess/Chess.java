package chess;

public class Chess {
	
	private ChessView chessView;

	private Controller controller;
	
	private Board board;
	
	private Turn turn;
	
	public Chess(){
		board = new Board();
		turn = new Turn();
		controller = new Controller(board, turn);
		chessView = new ChessView(controller);
	}
	
	public void play(){
		chessView.interact();
	}
	
	public static void main(String[] args){
		
	}
}
