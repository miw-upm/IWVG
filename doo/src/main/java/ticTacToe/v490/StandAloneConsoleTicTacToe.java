package ticTacToe.v490;

import ticTacToe.v490.controllers.local.logic.LocalLogic;
import ticTacToe.v490.views.console.ConsoleView;

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
