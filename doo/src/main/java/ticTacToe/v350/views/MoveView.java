package ticTacToe.v350.views;

import ticTacToe.v350.controllers.CoordinateController;
import ticTacToe.v350.controllers.Error;
import ticTacToe.v350.controllers.MoveController;
import ticTacToe.v350.controllers.RandomCoordinateController;
import ticTacToe.v350.controllers.UserCoordinateController;
import ticTacToe.v350.models.Coordinate;

public class MoveView extends ColocateView {

	MoveView(MoveController moveController) {
		super(moveController);
	}

	void interact() {
		Coordinate origin;
		Error error = null;
		do {
			origin = this.getOrigin();
			error = this.getMoveController().validateOrigin(origin);
			if (error != null) {
				this.writeln("" + error);
			}
		} while (error != null);
		this.getMoveController().remove(origin);
		Coordinate target;
		error = null;
		do {
			target = this.getTarget(origin);
			error = this.getMoveController().validateTarget(origin, target);
			if (error != null) {
				this.writeln("" + error);
			}
		} while (error != null);
		this.getMoveController().put(target);
		new BoardView(this.getMoveController()).write();
		if (this.getMoveController().existTicTacToe()) {
			this.writeln("Victoria!!!! " + this.getMoveController().take() + "! "
					+ this.getMoveController().take() + "! " + this.getMoveController().take()
					+ "! Victoria!!!!");
		}
	}
	
	private Coordinate getOrigin() {
		CoordinateController coordinateController = this.getMoveController().getCoordinateController();
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
		new CoordinateView("De", coordinate).interact();
		return coordinate;
	}

	private Coordinate getOrigin(RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getOrigin();
		this.writeln("La máquina quita de " + coordinate);
		this.readString("Pulse enter para continuar");
		return coordinate;
	}

	private Coordinate getTarget(Coordinate origin) {
		CoordinateController coordinateController = this.getMoveController().getCoordinateController();
		if (coordinateController instanceof UserCoordinateController) {
			return this.getTarget((UserCoordinateController) coordinateController);
		} else if (coordinateController instanceof RandomCoordinateController) {
			return this.getTarget((RandomCoordinateController) coordinateController, origin);
		}
		return null;
	}

	private Coordinate getTarget(UserCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
		new CoordinateView("A", coordinate).interact();
		return coordinate;
	}
	
	private Coordinate getTarget(RandomCoordinateController coordinateController, Coordinate origin) {
		Coordinate coordinate = coordinateController.getTarget(origin);
		this.writeln("La máquina pone en " + coordinate);
		this.readString("Pulse enter para continuar");
		return coordinate;
	}
	
	private MoveController getMoveController() {
		return (MoveController) this.getColocateController();
	}
	
}
