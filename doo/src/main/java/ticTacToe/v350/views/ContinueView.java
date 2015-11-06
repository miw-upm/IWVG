package ticTacToe.v350.views;

import ticTacToe.v350.controllers.ContinueController;

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
