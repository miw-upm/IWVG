package ticTacToe.v480.views.console;

import ticTacToe.v480.controllers.ContinueController;
import ticTacToe.v480.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
