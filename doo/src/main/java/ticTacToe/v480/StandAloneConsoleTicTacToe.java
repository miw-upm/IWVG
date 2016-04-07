package ticTacToe.v480;

import ticTacToe.v480.controllers.local.logic.LocalLogic;
import ticTacToe.v480.views.console.ConsoleView;

public class StandAloneConsoleTicTacToe extends TicTacToe {

	@Override
	protected Logic getLogic() {
		return new LocalLogic();
	}

	@Override
	protected View getView() {
		return new ConsoleView();
	}

	public static void main(String[] args) {
		new StandAloneConsoleTicTacToe().play();
	}

}
