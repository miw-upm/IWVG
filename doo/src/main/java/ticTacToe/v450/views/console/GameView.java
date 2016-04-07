package ticTacToe.v450.views.console;

import ticTacToe.v450.controllers.ColocateController;
import ticTacToe.v450.controllers.ColocateControllerVisitor;
import ticTacToe.v450.controllers.MoveController;
import ticTacToe.v450.controllers.PutController;
import ticTacToe.v450.controllers.errors.ErrorReport;
import ticTacToe.v450.models.Color;
import ticTacToe.v450.models.Coordinate;

class GameView implements ColocateControllerVisitor {

	private BoardView boardView;
	
	private ErrorReportView errorReportView;
	
	private Coordinate origin;
	
	GameView(BoardView boardView) {
		assert boardView != null;
		this.boardView = boardView;
		errorReportView = new ErrorReportView();
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
		ErrorReport errorReport = null;
		do {
			target = colocateCoordinateView.getCoordinate();
			errorReport = putController.validateTarget(target);
			if (errorReport != null) {
				errorReportView.write(errorReport);
			}
		} while (errorReport != null);
		putController.put(target);
	}

	private void remove(MoveController moveController,
			ColocateCoordinateView colocateCoordinateView) {
		ErrorReport errorReport = null;
		do {
			origin = colocateCoordinateView.getCoordinate();
			errorReport = moveController.validateOrigin(origin);
			if (errorReport != null) {
				errorReportView.write(errorReport);
			}
		} while (errorReport != null);
		moveController.remove(origin);
	}
	
	private void put(MoveController moveController,
			ColocateCoordinateView colocateCoordinateView) {
		Coordinate target;
		ErrorReport errorReport = null;
		do {
			target = colocateCoordinateView.getCoordinate();
			errorReport = moveController.validateTarget(origin, target);
			if (errorReport != null) {
				errorReportView.write(errorReport);
			}
		} while (errorReport != null);
		moveController.put(target);
	}

	private void showGame(ColocateController colocateController) {
		boardView.write(colocateController);
		if (colocateController.existTicTacToe()) {
			ColorView.instance().writeWinner(colocateController.take());
		}
	}

}
