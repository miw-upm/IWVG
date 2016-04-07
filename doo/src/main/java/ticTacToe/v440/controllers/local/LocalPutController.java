package ticTacToe.v440.controllers.local;

import ticTacToe.v440.controllers.ColocateControllerVisitor;
import ticTacToe.v440.controllers.OperationControllerVisitor;
import ticTacToe.v440.controllers.PutController;
import ticTacToe.v440.models.Coordinate;
import ticTacToe.v440.models.Game;
import ticTacToe.v440.controllers.errors.ErrorReport;

public class LocalPutController extends LocalColocateController implements
		PutController {

	LocalPutController(LocalLogic localLogic, Game game, LocalCoordinateController coordinateController) {
		super(localLogic, game, coordinateController);
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
