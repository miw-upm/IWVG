package ticTacToe.v430.views.console;

import ticTacToe.v430.controllers.ContinueController;
import ticTacToe.v430.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
