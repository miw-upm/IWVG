package ticTacToe.v390.views;

import ticTacToe.v390.controllers.StartController;
import ticTacToe.v390.utils.LimitedIntDialog;

public class StartView {

	void interact(StartController startController){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.start(users);
		new BoardView(startController).write();
	}
}
