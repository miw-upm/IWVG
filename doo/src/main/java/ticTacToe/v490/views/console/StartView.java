package ticTacToe.v490.views.console;

import ticTacToe.v490.controllers.StartController;
import ticTacToe.v490.utils.LimitedIntDialog;

class StartView {

	private BoardView boardView;
	
	StartView(BoardView boardView) {
		this.boardView = boardView;
	}
	
	void interact(StartController startController){
		int users = LimitedIntDialog.instance().read("Cu�ntos usuarios?", 0, 2);
		startController.start(users);
		boardView.write(startController);
	}
}
