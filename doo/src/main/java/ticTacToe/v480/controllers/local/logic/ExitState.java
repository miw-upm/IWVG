package ticTacToe.v480.controllers.local.logic;

import ticTacToe.v480.controllers.local.LocalOperationController;

class ExitState extends State {

	ExitState(StatesBuilder statesBuilder){
		super(statesBuilder);
	}
	
	@Override
	LocalOperationController getOperationController() {
		return null;
	}

}
