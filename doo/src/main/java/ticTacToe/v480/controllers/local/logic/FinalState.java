package ticTacToe.v480.controllers.local.logic;

import ticTacToe.v480.controllers.local.LocalContinueController;
import ticTacToe.v480.controllers.local.LocalOperationController;
import ticTacToe.v480.controllers.local.LocalOperationControllerBuilder;

class FinalState extends State {

	private LocalContinueController localContinueController;

	FinalState(StatesBuilder statesBuilder,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		super(statesBuilder);
		localContinueController = localOperationControllerBuilder
				.getContinueController();
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
