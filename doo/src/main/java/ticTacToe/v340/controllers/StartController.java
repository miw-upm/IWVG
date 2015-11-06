package ticTacToe.v340.controllers;

import ticTacToe.v340.models.Game;
import ticTacToe.v340.models.State;
import ticTacToe.v340.utils.ClosedInterval;

public class StartController extends OperationController {

	private ColocateControllerBuilder colocateControllerBuilder;

	StartController(Game game, ColocateControllerBuilder colocateControllerBuilder) {
		super(game);
		assert colocateControllerBuilder != null;
		this.colocateControllerBuilder = colocateControllerBuilder;
	}
	
	public void setUsers(int users){
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		assert this.getState() == State.INITIAL;
		colocateControllerBuilder.build(users);
		this.setState(State.IN_GAME);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);		
	}

}
