package ticTacToe.v410.views.console;

import ticTacToe.v410.controllers.ColocateController;
import ticTacToe.v410.controllers.ColocateControllerVisitor;
import ticTacToe.v410.controllers.MoveController;
import ticTacToe.v410.controllers.PutController;
import ticTacToe.v410.controllers.Error;
import ticTacToe.v410.models.Color;
import ticTacToe.v410.models.Coordinate;
import ticTacToe.v410.utils.IO;

class GameView implements ColocateControllerVisitor {

	private BoardView boardView;
	
	private Coordinate origin;
	
	GameView(BoardView boardView) {
		assert boardView != null;
		this.boardView = boardView;
	}

	void interact(ColocateController colocateController) {
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
		ColorView.instance().writeln(title + " el jugador ", color);
	}

	private void put(PutController putController,
			ColocateCoordinateView colocateCoordinateView) {
		Coordinate target;
		Error error = null;
		do {
			target = colocateCoordinateView.getCoordinate();
			error = putController.validateTarget(target);
			if (error != null) {
				IO.instance().writeln("" + error);
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
				IO.instance().writeln("" + error);
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
				IO.instance().writeln("" + error);
			}
		} while (error != null);
		moveController.put(target);
	}

	private void showGame(ColocateController colocateController) {
		boardView.write(colocateController);
		if (colocateController.existTicTacToe()) {
			ColorView.instance().writeWinner(colocateController.take());
		}
	}

}
