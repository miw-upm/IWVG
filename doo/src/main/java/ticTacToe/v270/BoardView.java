package ticTacToe.v270;

public class BoardView {

	private Board board;
	
	public BoardView(Board board){
		this.board = board;
	}
	
	public void write() {
		IO io = new IO();
		for (int i = 0; i < TicTacToeCoordinate.DIMENSION; i++) {
			for (int j = 0; j < TicTacToeCoordinate.DIMENSION; j++) {
				io.write(board.getColor(new TicTacToeCoordinate(i, j)) + " ");
			}
			io.writeln();
		}
	}
}
