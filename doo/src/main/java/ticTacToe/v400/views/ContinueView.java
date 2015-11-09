package ticTacToe.v400.views;

import ticTacToe.v400.controllers.ContinueController;
import ticTacToe.v400.utils.YesNoDialog;

public class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
