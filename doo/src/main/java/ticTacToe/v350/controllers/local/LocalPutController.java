package ticTacToe.v350.controllers.local;

import ticTacToe.v350.controllers.Error;
import ticTacToe.v350.controllers.OperationControllerVisitor;
import ticTacToe.v350.controllers.PutController;
import ticTacToe.v350.models.Coordinate;
import ticTacToe.v350.models.Game;

public class LocalPutController extends LocalColocateController implements
		PutController {

	LocalPutController(Game game, LocalCoordinateController coordinateController) {
		super(game, coordinateController);
		assert coordinateController != null;
	}

	@Override
	public void put(Coordinate target) {
		assert target != null;
		assert this.validateTarget(target) == null;
		super.put(target);
	}

	public Error validateTarget(Coordinate target) {
		assert target != null;
		return super.validateTarget(target);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		assert operationControllerVisitor != null;
		operationControllerVisitor.visit(this);
	}
}
