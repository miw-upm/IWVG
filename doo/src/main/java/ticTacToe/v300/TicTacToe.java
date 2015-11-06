package ticTacToe.v300;

import ticTacToe.v300.controllers.Logic;
import ticTacToe.v300.controllers.OperationController;

public class TicTacToe {

	private Logic logic;
	
	public TicTacToe() {
		logic = new Logic();
	}
	
	public void play() {
		OperationController controller;
		do {
			controller = logic.getController();
			if (controller != null){
				controller.control();
			}
		} while (controller != null);
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
