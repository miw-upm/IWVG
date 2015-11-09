package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.Error;
import ticTacToe.v350.controllers.MoveController;
import ticTacToe.v350.controllers.OperationControllerVisitor;
import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

public class LocalMoveController extends LocalColocateController implements
		MoveController {

	private Coordinate origin;

	LocalMoveController(Game game, LocalCoordinateController coordinateController) {
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

	public Error validateTarget(Coordinate origin, Coordinate target) {
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
