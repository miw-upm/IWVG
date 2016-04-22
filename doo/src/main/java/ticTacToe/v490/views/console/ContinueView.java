package ticTacToe.v490.views.console;

import ticTacToe.v490.controllers.ContinueController;
import ticTacToe.v490.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
