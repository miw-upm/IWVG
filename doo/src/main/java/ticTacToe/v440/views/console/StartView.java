package ticTacToe.v440.views.console;

import ticTacToe.v440.controllers.StartController;
import ticTacToe.v440.utils.LimitedIntDialog;

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
