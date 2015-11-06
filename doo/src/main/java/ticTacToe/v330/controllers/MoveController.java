package ticTacToe.v330.controllers;

import ticTacToe.v330.models.Game;
import ticTacToe.v330.models.Coordinate;

public class MoveController extends ColocateController {

	private Coordinate origin;

	MoveController(Game game, CoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void remove(Coordinate origin) {
		assert origin != null;
		assert this.validateOrigin(origin) == null;
		this.origin = origin;
		super.remove(origin);
	}

	public Error validateOrigin(Coordinate origin) {
		assert origin != null;
		if (!this.full(origin)) {
			return Error.NOT_PROPERTY;
		}
		return null;
	}

	@Override
	public void put(Coordinate target) {
		assert target != null;
		assert origin != null;
		assert this.validateTarget(origin, target) == null;
		super.put(target);
		origin = null;
	}

	public Error validateTarget(Coordinate origin,
			Coordinate target) {
		Error error = super.validateTarget(target);
		if (error != null) {
			return error;
		}
		if (origin.equals(target)) {
			return Error.REPEATED_COORDINATE;
		}
		return null;
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);		
	}

}
