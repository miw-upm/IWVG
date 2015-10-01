package ticTacToe.version210;

public class BoardView {

	private Board board;

	public BoardView(Board board) {
		this.board = board;
	}

	public void render() {
		IO io = new IO();
		for (int i = 0; i < Board.DIMENSION; i++) {
			for (int j = 0; j < Board.DIMENSION; j++) {
				io.write(board.getColor(new Coordinate(i, j)).getValue() + " ");
			}
			io.writeln();
		}
	}
}
