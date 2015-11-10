package ticTacToe.v390.views;

import ticTacToe.v390.controllers.CoordinateController;
import ticTacToe.v390.controllers.CoordinateControllerVisitor;
import ticTacToe.v390.controllers.RandomCoordinateController;
import ticTacToe.v390.controllers.UserCoordinateController;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.utils.IO;

public class PutTargetCoordinateView implements CoordinateControllerVisitor {

	private CoordinateController coordinateController;

	private Coordinate target;

	PutTargetCoordinateView(CoordinateController coordinateController) {
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}		
		
	Coordinate getTarget(){
		target = coordinateController.getTarget();
		coordinateController.accept(this);
		return target;
	}

	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		new CoordinateView("En", target).interact();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		IO io = new IO();
		io.writeln("La máquina pone en " + target);
		io.readString("Pulse enter para continuar");
	}

}
