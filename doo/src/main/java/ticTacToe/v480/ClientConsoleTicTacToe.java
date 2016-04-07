package ticTacToe.v480;

import ticTacToe.v480.controllers.remote.logic.RemoteLogic;
import ticTacToe.v480.views.console.ConsoleView;

public class ClientConsoleTicTacToe extends TicTacToe {

	@Override
	protected Logic getLogic() {
		return new RemoteLogic();
	}

	@Override
	protected View getView() {
		return new ConsoleView();
	}
	
	public static void main(String[] args) {
		new ClientConsoleTicTacToe().play();
	}

}
