package ticTacToe.v490.controllers.local.logic;

import ticTacToe.v490.controllers.local.LocalOperationController;
import ticTacToe.v490.controllers.local.LocalOperationControllerBuilder;
import ticTacToe.v490.controllers.local.LocalStartController;

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
