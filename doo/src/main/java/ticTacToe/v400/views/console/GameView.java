package ticTacToe.v400.views.console;

import ticTacToe.v400.controllers.ColocateControllerVisitor;
import ticTacToe.v400.controllers.ColocateController;
import ticTacToe.v400.controllers.PutController;
import ticTacToe.v400.controllers.MoveController;
import ticTacToe.v400.controllers.Error;
import ticTacToe.v400.models.Color;
import ticTacToe.v400.models.Coordinate;
import ticTacToe.v400.utils.IO;

class GameView implements ColocateControllerVisitor {

	private IO io = new IO();
	
	private ColorView colorView;

	private Coordinate origin;

	public void interact(ColocateController colocateController) {
		colorView = new ColorView(colocateController.take());
		colocateController.accept(this);
	}

	@Override
	public void visit(PutController putController) {
		this.showTitle("Pone", putController.take());
		PutTargetCoordinateView putCoordinateView = new PutTargetCoordinateView(
				putController.getCoordinateController());
		this.put(putController, putCoordinateView);
		this.showGame(putController);
	}

	@Override
	public void visit(MoveController moveController) {
		this.showTitle("Mueve", moveController.take());
		MoveOriginCoordinateView moveOriginCoordinateView = new MoveOriginCoordinateView(
				moveController.getCoordinateController());
		this.remove(moveController, moveOriginCoordinateView);
		MoveTargetCoordinateView moveTargetCoordinateView = new MoveTargetCoordinateView(
				moveController.getCoordinateController(), origin);
		this.put(moveController, moveTargetCoordinateView);
		this.showGame(moveController);
	}

	private void showTitle(String title, Color color) {
		colorView.writeln(title + " el jugador ");
	}

	private void put(PutController putController,
			ColocateCoordinateView colocateCoordinateView) {
		Coordinate target;
		Error error = null;
		do {
			target = colocateCoordinateView.getCoordinate();
			error = putController.validateTarget(target);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		putController.put(target);
	}

	private void remove(MoveController moveController,
			ColocateCoordinateView colocateCoordinateView) {
		Error error = null;
		do {
			origin = colocateCoordinateView.getCoordinate();
			error = moveController.validateOrigin(origin);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		moveController.remove(origin);
	}
	
	private void put(MoveController moveController,
			ColocateCoordinateView colocateCoordinateView) {
		Coordinate target;
		Error error = null;
		do {
			target = colocateCoordinateView.getCoordinate();
			error = moveController.validateTarget(origin, target);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		moveController.put(target);
	}

	private void showGame(ColocateController colocateController) {
		new BoardView(colocateController).write();
		if (colocateController.existTicTacToe()) {
			colorView.writeWinner();
		}
	}

}
