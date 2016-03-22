package ticTacToe.v400.views.console;

import ticTacToe.v400.controllers.StartController;
import ticTacToe.v400.utils.LimitedIntDialog;

class StartView {

	void interact(StartController startController){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.start(users);
		new BoardView(startController).write();
	}
}
