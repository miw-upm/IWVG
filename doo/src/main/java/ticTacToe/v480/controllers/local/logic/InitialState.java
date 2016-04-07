package ticTacToe.v480.controllers.local.logic;

import ticTacToe.v480.controllers.local.LocalOperationController;
import ticTacToe.v480.controllers.local.LocalOperationControllerBuilder;
import ticTacToe.v480.controllers.local.LocalStartController;

class InitialState extends State {

	private LocalStartController localStartController;
	
	InitialState(StatesBuilder statesBuilder, LocalOperationControllerBuilder localOperationControllerBuilder){
		super(statesBuilder);
		localStartController = localOperationControllerBuilder.getStartController();
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
