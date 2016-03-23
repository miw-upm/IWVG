package ticTacToe.v340.views;

import ticTacToe.v340.controllers.ContinueController;
import ticTacToe.v340.controllers.CoordinateController;
import ticTacToe.v340.controllers.Error;
import ticTacToe.v340.controllers.MoveController;
import ticTacToe.v340.controllers.OperationController;
import ticTacToe.v340.controllers.OperationControllerVisitor;
import ticTacToe.v340.controllers.PutController;
import ticTacToe.v340.controllers.RandomCoordinateController;
import ticTacToe.v340.controllers.StartController;
import ticTacToe.v340.controllers.UserCoordinateController;
import ticTacToe.v340.models.Coordinate;
import ticTacToe.v340.utils.IO;
import ticTacToe.v340.utils.LimitedIntDialog;
import ticTacToe.v340.utils.YesNoDialog;

public class TicTacToeView implements OperationControllerVisitor {

	private IO io = new IO();

	public void interact(OperationController operationController) {
		assert operationController != null;
		operationController.accept(this);
	}
	
	@Override
	public void visit(StartController startController) {
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.setUsers(users);
		new BoardView(startController).write();
	}
	
	@Override
	public void visit(PutController putController) {
		ColorView colorView = new ColorView(putController.take());
		colorView.writeln("Pone el jugador ");
		Coordinate target;
		Error error = null;
		do {
			target = this.getTarget("En",
					putController.getCoordinateController());
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
			origin = this.getOrigin(moveController.getCoordinateController());
			error = moveController.validateOrigin(origin);
			if (error != null) {
				io.writeln("" + error);
			}
		} while (error != null);
		moveController.remove(origin);
		Coordinate target;
		error = null;
		do {
			target = this.getTarget("A",
					moveController.getCoordinateController(), origin);
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

	@Override
	public void visit(ContinueController continueController) {
		continueController.setContinue(new YesNoDialog("Desea continuar")
				.read());
	}
	
	private Coordinate getTarget(String title,
			CoordinateController coordinateController) {
		if (coordinateController instanceof UserCoordinateController) {
			return this.getTarget(title,
					(UserCoordinateController) coordinateController);
		} else if (coordinateController instanceof RandomCoordinateController) {
			return this.getTarget(title,
					(RandomCoordinateController) coordinateController);
		}
		return null;
	}

	private Coordinate getTarget(String title,
			UserCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
		new CoordinateView(title, coordinate).read();
		return coordinate;
	}

	private Coordinate getTarget(String title,
			RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
		new CoordinateView("La máquina pone en ", coordinate).write();
		io.readString(". Pulse enter para continuar");
		return coordinate;
	}
	
	private Coordinate getOrigin(CoordinateController coordinateController) {
		if (coordinateController instanceof UserCoordinateController) {
			return this
					.getOrigin((UserCoordinateController) coordinateController);
		} else if (coordinateController instanceof RandomCoordinateController) {
			return this
					.getOrigin((RandomCoordinateController) coordinateController);
		}
		return null;
	}

	private Coordinate getOrigin(UserCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getOrigin();
		new CoordinateView("De", coordinate).read();
		return coordinate;
	}

	private Coordinate getOrigin(RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getOrigin();
		new CoordinateView("La máquina quita de ", coordinate).write();
		io.readString(". Pulse enter para continuar");
		return coordinate;
	}

	private Coordinate getTarget(String title,
			CoordinateController coordinateController, Coordinate origin) {
		if (coordinateController instanceof UserCoordinateController) {
			return this.getTarget(title,
					(UserCoordinateController) coordinateController);
		} else if (coordinateController instanceof RandomCoordinateController) {
			return this.getTarget(title,
					(RandomCoordinateController) coordinateController, origin);
		}
		return null;
	}

	private Coordinate getTarget(String title,
			RandomCoordinateController coordinateController, Coordinate origin) {
		Coordinate coordinate = coordinateController.getTarget(origin);
		new CoordinateView("La máquina pone en ", coordinate).write();
		io.readString(". Pulse enter para continuar");
		return coordinate;
	}

}
