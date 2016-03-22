package ticTacToe.v400.views.console;

import ticTacToe.v400.controllers.ContinueController;
import ticTacToe.v400.utils.YesNoDialog;

class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
