package ticTacToe.v410.views.console;

import ticTacToe.v410.controllers.ContinueController;
import ticTacToe.v410.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
