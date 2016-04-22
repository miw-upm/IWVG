package ticTacToe.v490.controllers.local.logic;

import ticTacToe.v490.controllers.local.LocalOperationController;
import ticTacToe.v490.controllers.local.LocalOperationControllerBuilder;

class InGameState extends State {

	private LocalOperationControllerBuilder localOperationControllerBuilder;
	
	public InGameState(StatesBuilder statesBuilder,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		super(statesBuilder);
		this.localOperationControllerBuilder = localOperationControllerBuilder;
	}

	@Override
	State end() {
		return statesBuilder.getFinalState();
	}

	@Override
	public LocalOperationController getOperationController() {
		return localOperationControllerBuilder.getColocateController();
	}

}
