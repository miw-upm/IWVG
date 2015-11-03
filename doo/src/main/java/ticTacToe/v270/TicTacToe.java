package ticTacToe.v270;

public class TicTacToe {

	private Logic logic;
	
	private TicTacToeView ticTacToeView;
	
	public TicTacToe() {
		logic = new Logic();
		ticTacToeView = new TicTacToeView(logic);
	}
	
	public void play() {
		ticTacToeView.interact();
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
