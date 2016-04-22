package ticTacToe.v490;

import ticTacToe.v490.controllers.remote.logic.RemoteLogic;
import ticTacToe.v490.views.console.ConsoleView;

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
