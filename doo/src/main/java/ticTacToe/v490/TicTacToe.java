package ticTacToe.v490;

import ticTacToe.v490.controllers.OperationController;

public abstract class TicTacToe {

	private Logic logic;
	
	private View view;
	
	public TicTacToe() {
		this.view = this.getView();
		this.logic = this.getLogic();
	}
	
	protected abstract Logic getLogic();

	protected abstract View getView();

	public void play() {
		OperationController controller;
		do {
			controller = logic.getOperationController();
			if (controller != null){
				view.interact(controller);
			}
		} while (controller != null);
	}
	
}
