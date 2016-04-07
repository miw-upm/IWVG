package ticTacToe.v420.views.console;

import ticTacToe.v420.controllers.ContinueController;
import ticTacToe.v420.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController) {
		continueController.resume(YesNoDialog.instance()
				.read("Desea continuar"));
	}
}
