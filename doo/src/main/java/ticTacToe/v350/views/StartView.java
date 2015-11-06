package ticTacToe.v350.views;

import ticTacToe.v350.controllers.StartController;

class StartView {

	private StartController startController;
	
	StartView(StartController startController){
		this.startController = startController;
	}
	
	void interact(){
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.setUsers(users);
		new BoardView(startController).write();
	}
}
