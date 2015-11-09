package ticTacToe.v360.controllers.local;

import ticTacToe.v360.controllers.Error;
import ticTacToe.v360.controllers.OperationControllerVisitor;
import ticTacToe.v360.controllers.PutController;
import ticTacToe.v360.models.Coordinate;
import ticTacToe.v360.models.Game;

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

	public Error validateTarget(Coordinate target) {
		return super.validateTarget(target);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}
}
