package ticTacToe.v470.controllers.local.logic;

import ticTacToe.v470.controllers.local.LocalOperationController;
import ticTacToe.v470.controllers.local.LocalOperationControllerBuilder;
import ticTacToe.v470.controllers.local.LocalStartController;

class InitialState extends State {

	private LocalStartController localStartController;
	
	InitialState(StatesBuilder statesBuilder, LocalOperationControllerBuilder localOperationControllerBuilder){
		super(statesBuilder);
		localStartController = localOperationControllerBuilder.getLocalStartController();
	}
	
	@Override
	State begin() {
		return statesBuilder.getInGameState();
	}
		
	@Override
	LocalOperationController getOperationController() {
		return localStartController;
	}

}
