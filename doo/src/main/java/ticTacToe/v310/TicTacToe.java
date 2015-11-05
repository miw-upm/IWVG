package ticTacToe.v310;

import ticTacToe.v310.controllers.Logic;
import ticTacToe.v310.controllers.OperationController;
import ticTacToe.v310.views.TicTacToeView;

public class TicTacToe {

	private Logic logic;
	
	private TicTacToeView view;
	
	public TicTacToe() {
		logic = new Logic();
		view = new TicTacToeView();
	}
	
	public void play() {
		OperationController controller;
		do {
			controller = logic.getController();
			if (controller != null){
				view.interact(controller);
			}
		} while (controller != null);
		
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
