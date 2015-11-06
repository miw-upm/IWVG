package ticTacToe.v350.views;

import ticTacToe.v350.controllers.CoordinateController;
import ticTacToe.v350.controllers.Error;
import ticTacToe.v350.controllers.PutController;
import ticTacToe.v350.controllers.RandomCoordinateController;
import ticTacToe.v350.controllers.UserCoordinateController;
import ticTacToe.v350.models.Coordinate;

class PutView extends ColocateView {

	PutView(PutController putController) {
		super(putController);
	}

	void interact() {
		this.writeln("Pone el jugador " + this.getPutController().take());
		Coordinate target;
		Error error = null;
		do {
			target = this.getTarget();
			error = this.getPutController().validateTarget(target);
			if (error != null) {
				this.writeln("" + error);
			}
		} while (error != null);
		this.getPutController().put(target);
		new BoardView(this.getPutController()).write();
		if (this.getPutController().existTicTacToe()) {
			this.writeln("Victoria!!!! " + this.getPutController().take()
					+ "! " + this.getPutController().take() + "! "
					+ this.getPutController().take() + "! Victoria!!!!");
		}
	}

	private Coordinate getTarget() {
		CoordinateController coordinateController = this.getPutController()
				.getCoordinateController();
		if (coordinateController instanceof UserCoordinateController) {
			return this
					.getTarget((UserCoordinateController) coordinateController);
		} else if (coordinateController instanceof RandomCoordinateController) {
			return this
					.getTarget((RandomCoordinateController) coordinateController);
		}
		return null;
	}

	private Coordinate getTarget(UserCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
		new CoordinateView("En", coordinate).interact();
		return coordinate;
	}

	private Coordinate getTarget(RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
		this.writeln("La máquina pone en " + coordinate);
		this.readString("Pulse enter para continuar");
		return coordinate;
	}

	private PutController getPutController() {
		return (PutController) this.getColocateController();
	}

}
