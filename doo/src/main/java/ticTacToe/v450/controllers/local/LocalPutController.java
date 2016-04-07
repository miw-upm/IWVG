package ticTacToe.v450.controllers.local;

import ticTacToe.v450.controllers.ColocateControllerVisitor;
import ticTacToe.v450.controllers.OperationControllerVisitor;
import ticTacToe.v450.controllers.PutController;
import ticTacToe.v450.controllers.errors.ErrorReport;
import ticTacToe.v450.models.Coordinate;
import ticTacToe.v450.models.Game;

public class LocalPutController extends LocalColocateController implements
		PutController {

	LocalPutController(Game game, LocalCoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void put(Coordinate target) {
		assert this.validateTarget(target) == null;
		super.put(target);
	}

	public ErrorReport validateTarget(Coordinate target) {
		return super.validateTarget(target);
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
