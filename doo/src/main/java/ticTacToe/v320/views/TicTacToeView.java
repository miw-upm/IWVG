package ticTacToe.v320.views;

import ticTacToe.v320.controllers.ContinueController;
import ticTacToe.v320.controllers.CoordinateController;
import ticTacToe.v320.controllers.Error;
import ticTacToe.v320.controllers.MoveController;
import ticTacToe.v320.controllers.OperationController;
import ticTacToe.v320.controllers.PutController;
import ticTacToe.v320.controllers.RandomCoordinateController;
import ticTacToe.v320.controllers.StartController;
import ticTacToe.v320.controllers.UserCoordinateController;
import ticTacToe.v320.models.Coordinate;
import ticTacToe.v320.utils.IO;
import ticTacToe.v320.utils.LimitedIntDialog;
import ticTacToe.v320.utils.YesNoDialog;

public class TicTacToeView {

	private IO io = new IO();

	public void interact(OperationController controller) {
		assert controller != null;
		if (controller instanceof StartController) {
			this.interact((StartController) controller);
		} else if (controller instanceof PutController) {
			this.interact((PutController) controller);
		} else if (controller instanceof MoveController) {
			this.interact((MoveController) controller);
		} else if (controller instanceof ContinueController) {
			this.interact((ContinueController) controller);
		}
	}

	private void interact(StartController startController) {
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.setUsers(users);
		new BoardView(startController).write();
	}

	private void interact(PutController putController) {
		io.writeln("Pone el jugador " + putController.take());
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
			io.writeln("Victoria!!!! " + putController.take() + "! "
					+ putController.take() + "! " + putController.take()
					+ "! Victoria!!!!");
		}
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
		Coordinate coordinate = coordinateController
				.getTarget();
		new CoordinateView(title, coordinate).interact();
		return coordinate;
	}

	private Coordinate getTarget(String title,
			RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController
				.getTarget();
		io.writeln("La máquina pone en " + coordinate);
		io.readString("Pulse enter para continuar");
		return coordinate;
	}

	private void interact(MoveController moveController) {
		io.writeln("Mueve el jugador " + moveController.take());
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
			io.writeln("Victoria!!!! " + moveController.take() + "! "
					+ moveController.take() + "! " + moveController.take()
					+ "! Victoria!!!!");
		}
	}

	private Coordinate getOrigin(
			CoordinateController coordinateController) {
		if (coordinateController instanceof UserCoordinateController) {
			return this
					.getOrigin((UserCoordinateController) coordinateController);
		} else if (coordinateController instanceof RandomCoordinateController) {
			return this
					.getOrigin((RandomCoordinateController) coordinateController);
		}
		return null;
	}

	private Coordinate getOrigin(
			UserCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController
				.getOrigin();
		new CoordinateView("De", coordinate).interact();
		return coordinate;
	}

	private Coordinate getOrigin(
			RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController
				.getOrigin();
		io.writeln("La máquina quita de " + coordinate);
		io.readString("Pulse enter para continuar");
		return coordinate;
	}
	
	private Coordinate getTarget(String title,
			CoordinateController coordinateController,
			Coordinate origin) {
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
			RandomCoordinateController coordinateController,
			Coordinate origin) {
		Coordinate coordinate = coordinateController
				.getTarget(origin);
		io.writeln("La máquina pone en " + coordinate);
		io.readString("Pulse enter para continuar");
		return coordinate;
	}

	private void interact(ContinueController continueController) {
		continueController.setContinue(new YesNoDialog("Desea continuar")
				.read());
	}

}
