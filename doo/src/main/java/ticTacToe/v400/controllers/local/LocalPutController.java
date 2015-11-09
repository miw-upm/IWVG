package ticTacToe.v400.controllers.local;

import ticTacToe.v400.controllers.ColocateControllerVisitor;
import ticTacToe.v400.controllers.Error;
import ticTacToe.v400.controllers.OperationControllerVisitor;
import ticTacToe.v400.controllers.PutController;
import ticTacToe.v400.models.Coordinate;
import ticTacToe.v400.models.Game;

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
