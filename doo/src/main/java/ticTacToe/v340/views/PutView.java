package ticTacToe.v340.views;

import ticTacToe.v340.controllers.CoordinateController;
import ticTacToe.v340.controllers.Error;
import ticTacToe.v340.controllers.PutController;
import ticTacToe.v340.controllers.RandomCoordinateController;
import ticTacToe.v340.controllers.UserCoordinateController;
import ticTacToe.v340.models.Coordinate;

class PutView extends ColocateView {

	PutView(PutController putController) {
		super(putController);
	}
	
	@Override
	public void interact(){
		super.interact("Pone");
	}
	
	@Override
	protected void colocate() {
		this.put();
	}
	
	@Override
	protected Coordinate getTarget() {
		System.out.println("separar");
		CoordinateController coordinateController = this.getColocateController()
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

	@Override
	protected Coordinate getTarget(UserCoordinateController coordinateController) {
		System.out.println("UserCoordinateController");
		Coordinate coordinate = coordinateController.getTarget();
		new CoordinateView("En", coordinate).interact();
		return coordinate;
	}

	@Override
	protected Coordinate getTarget(RandomCoordinateController coordinateController) {
		System.out.println("RandomCoordinateController");
		Coordinate coordinate = coordinateController.getTarget();
		this.writeln("La máquina pone en " + coordinate);
		this.readString("Pulse enter para continuar");
		return coordinate;
	}
	
	@Override
	protected Error validateTarget() {
		return this.getPutController().validateTarget(this.getTarget());
	}

	private PutController getPutController() {
		return (PutController) this.getColocateController();
	}

}
