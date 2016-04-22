package ticTacToe.v490.controllers.local.logic;

import ticTacToe.v490.controllers.local.LocalOperationController;

class ExitState extends State {

	ExitState(StatesBuilder statesBuilder){
		super(statesBuilder);
	}
	
	@Override
	LocalOperationController getOperationController() {
		return null;
	}

}
