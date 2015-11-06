package ticTacToe.v285;

import ticTacToe.v285.controllers.Logic;
import ticTacToe.v285.controllers.OperationController;


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
