package ticTacToe.v460.views.console;

import ticTacToe.v460.controllers.ContinueController;
import ticTacToe.v460.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
