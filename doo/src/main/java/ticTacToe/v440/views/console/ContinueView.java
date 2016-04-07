package ticTacToe.v440.views.console;

import ticTacToe.v440.controllers.ContinueController;
import ticTacToe.v440.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
