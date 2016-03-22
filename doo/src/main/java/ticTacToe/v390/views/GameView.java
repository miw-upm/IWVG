package ticTacToe.v390.views;

import ticTacToe.v390.controllers.ColocateControllerVisitor;
import ticTacToe.v390.controllers.ColocateController;
import ticTacToe.v390.controllers.PutController;
import ticTacToe.v390.controllers.MoveController;
import ticTacToe.v390.controllers.Error;
import ticTacToe.v390.models.Coordinate;
import ticTacToe.v390.utils.IO;

class GameView implements ColocateControllerVisitor {

	private IO io = new IO();

	public void interact(ColocateController colocateController) {
		colocateController.accept(this);
	}

	@Override
	public void visit(PutController putController) {
		ColorView colorView = new ColorView(putController.take());
		colorView.writeln("Pone el jugador ");
		Coordinate target;
		Error error = null;
		do {
			target = new PutTargetCoordinateView(
					putController.getCoordinateController()).getTarget();
			error = putController.validateTarget(target);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		putController.put(target);
		new BoardView(putController).write();
		if (putController.existTicTacToe()) {
			colorView.writeWinner();
		}
	}

	@Override
	public void visit(MoveController moveController) {
		ColorView colorView = new ColorView(moveController.take());
		colorView.writeln("Mueve el jugador ");
		Coordinate origin;
		Error error = null;
		do {
			origin = new MoveOriginCoordinateView(
					moveController.getCoordinateController()).getOrigin();
			error = moveController.validateOrigin(origin);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		moveController.remove(origin);
		Coordinate target;
		error = null;
		do {
			target = new MoveTargetCoordinateView(
					moveController.getCoordinateController(), origin).getTarget();
			error = moveController.validateTarget(origin, target);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		moveController.put(target);
		new BoardView(moveController).write();
		if (moveController.existTicTacToe()) {
			colorView.writeWinner();
		}
	}

}
