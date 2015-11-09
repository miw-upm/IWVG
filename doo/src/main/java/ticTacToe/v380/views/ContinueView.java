package ticTacToe.v380.views;

import ticTacToe.v380.controllers.ContinueController;
import ticTacToe.v380.utils.YesNoDialog;

public class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
