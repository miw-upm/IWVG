package ticTacToe.v390.controllers.local;

import ticTacToe.v390.controllers.ColocateControllerVisitor;
import ticTacToe.v390.controllers.Error;
import ticTacToe.v390.controllers.MoveController;
import ticTacToe.v390.controllers.OperationControllerVisitor;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.models.Game;

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

	@Override
	public void accept(ColocateControllerVisitor colocateControllerVisitor) {
		colocateControllerVisitor.visit(this);
	}

}
