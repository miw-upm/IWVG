package ticTacToe.v430.views.console;

import ticTacToe.v430.controllers.StartController;
import ticTacToe.v430.utils.LimitedIntDialog;

class StartView {

	private BoardView boardView;
	
	StartView(BoardView boardView) {
		this.boardView = boardView;
	}
	
	void interact(StartController startController){
		int users = LimitedIntDialog.instance().read("Cuántos usuarios?", 0, 2);
		startController.start(users);
		boardView.write(startController);
	}
}
