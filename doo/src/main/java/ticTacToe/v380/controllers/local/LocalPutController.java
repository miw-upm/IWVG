package ticTacToe.v380.controllers.local;

import ticTacToe.v380.controllers.ColocateControllerVisitor;
import ticTacToe.v380.controllers.Error;
import ticTacToe.v380.controllers.OperationControllerVisitor;
import ticTacToe.v380.controllers.PutController;
import ticTacToe.v380.models.Coordinate;
import ticTacToe.v380.models.Game;

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

	@Override
	public void accept(ColocateControllerVisitor colocateControllerVisitor) {
		colocateControllerVisitor.visit(this);
	}
}
