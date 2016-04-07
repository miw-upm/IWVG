package ticTacToe.v470.views.console;

import ticTacToe.v470.controllers.ContinueController;
import ticTacToe.v470.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
