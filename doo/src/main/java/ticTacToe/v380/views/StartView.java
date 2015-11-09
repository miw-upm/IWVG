package ticTacToe.v380.views;

import ticTacToe.v380.controllers.StartController;
import ticTacToe.v380.utils.LimitedIntDialog;

public class StartView {

	void interact(StartController startController){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.start(users);
		new BoardView(startController).write();
	}
}
