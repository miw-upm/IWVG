package ticTacToe.v390.views;

import ticTacToe.v390.controllers.ContinueController;
import ticTacToe.v390.utils.YesNoDialog;

public class ContinueView {

	void interact(ContinueController continueController){
		continueController.resume(new YesNoDialog("Desea continuar")
		.read());
	}
}
