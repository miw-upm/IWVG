package ticTacToe.v370.views;

import ticTacToe.v370.controllers.StartController;
import ticTacToe.v370.utils.LimitedIntDialog;

public class StartView {

	void interact(StartController startController){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.start(users);
		new BoardView(startController).write();
	}
}
