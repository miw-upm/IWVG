package ticTacToe.v470.controllers.local.logic;

import ticTacToe.v470.controllers.local.LocalContinueController;
import ticTacToe.v470.controllers.local.LocalOperationController;
import ticTacToe.v470.controllers.local.LocalOperationControllerBuilder;

class FinalState extends State {

	private LocalContinueController localContinueController;

	FinalState(StatesBuilder statesBuilder,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		super(statesBuilder);
		localContinueController = localOperationControllerBuilder
				.getLocalContinueController();
	}

	@Override
	State initialize() {
		return statesBuilder.getInitialState();
	}
	
	@Override
	State exit() {
		return statesBuilder.getExitState();
	}

	@Override
	LocalOperationController getOperationController() {
		return localContinueController;
	}

}
