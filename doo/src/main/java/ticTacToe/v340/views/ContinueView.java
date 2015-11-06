package ticTacToe.v340.views;

import ticTacToe.v340.controllers.ContinueController;

class ContinueView {

	private ContinueController continueController;

	ContinueView(ContinueController continueController) {
		this.continueController = continueController;
	}
	
	void interact(){
		continueController.setContinue(new YesNoDialog("Desea continuar")
		.read());
	}
	
	
}
