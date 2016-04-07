package ticTacToe.v450.views.console;

import ticTacToe.v450.controllers.ContinueController;
import ticTacToe.v450.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
