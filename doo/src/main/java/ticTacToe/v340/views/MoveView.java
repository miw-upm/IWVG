package ticTacToe.v340.views;

import ticTacToe.v340.controllers.CoordinateController;
import ticTacToe.v340.controllers.Error;
import ticTacToe.v340.controllers.MoveController;
import ticTacToe.v340.controllers.RandomCoordinateController;
import ticTacToe.v340.controllers.UserCoordinateController;
import ticTacToe.v340.models.Coordinate;

public class MoveView extends ColocateView {

	private Coordinate origin;
	
	MoveView(MoveController moveController) {
		super(moveController);
	}
	
	@Override
	public void interact(){
		super.interact("Mueve");
	}

	@Override
	protected void colocate() {
		this.remove();
		this.put();
	}
	
	private void remove(){
		Error error = null;
		do {
			origin = this.getOrigin();
			error = this.getMoveController().validateOrigin(origin);
			if (error != null) {
				this.writeln("" + error);
			}
		} while (error != null);
		this.getMoveController().remove(origin);
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

	@Override
	protected Coordinate getTarget() {
		CoordinateController coordinateController = this.getMoveController().getCoordinateController();
		if (coordinateController instanceof UserCoordinateController) {
			return this.getTarget((UserCoordinateController) coordinateController);
		} else if (coordinateController instanceof RandomCoordinateController) {
			return this.getTarget((RandomCoordinateController) coordinateController);
		}
		return null;
	}

	@Override
	protected Coordinate getTarget(UserCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
		new CoordinateView("A", coordinate).interact();
		return coordinate;
	}
	
	@Override
	protected Coordinate getTarget(RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget(origin);
		this.writeln("La máquina pone en " + coordinate);
		this.readString("Pulse enter para continuar");
		return coordinate;
	}
	
	@Override
	protected Error validateTarget() {
		return this.getMoveController().validateTarget(origin, super.getTarget());
	}
	
	private MoveController getMoveController() {
		return (MoveController) this.getColocateController();
	}
	
}
