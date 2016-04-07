package ticTacToe.v470.controllers.local;

import ticTacToe.v470.controllers.ColocateControllerVisitor;
import ticTacToe.v470.controllers.MoveController;
import ticTacToe.v470.controllers.OperationControllerVisitor;
import ticTacToe.v470.controllers.errors.ErrorGeneratorType;
import ticTacToe.v470.controllers.errors.ErrorReport;
import ticTacToe.v470.models.Coordinate;
import ticTacToe.v470.models.Game;

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

	public ErrorReport validateOrigin(Coordinate origin) {
		assert origin != null;
		if (!this.full(origin)) {
			return ErrorGeneratorType.NOT_PROPERTY.getErrorReport(this.getGame());
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

	public ErrorReport validateTarget(Coordinate origin, Coordinate target) {
		ErrorReport errorReport = super.validateTarget(target);
		if (errorReport != null) {
			return errorReport;
		}
		if (origin.equals(target)) {
			return ErrorGeneratorType.REPEATED_COORDINATE.getErrorReport(this.getGame());
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
