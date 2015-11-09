package ticTacToe.v370.views;

import ticTacToe.v370.controllers.ContinueController;
import ticTacToe.v370.utils.YesNoDialog;

public class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
