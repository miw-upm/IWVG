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
		CoordinateController coordinateController = this.getColocateController()
				.getCoordinateController();
		coordinateController.accept(this);
		return super.getTarget();
	}
	
	@Override
	public void visit(UserCoordinateController userCoordinateController) {
		this.setTarget(userCoordinateController.getTarget());
		new CoordinateView("En", super.getTarget()).interact();
	}

	@Override
	public void visit(RandomCoordinateController randomCoordinateController) {
		this.setTarget(randomCoordinateController.getTarget());
		this.writeln("La máquina pone en " + super.getTarget());
		this.readString("Pulse enter para continuar");
	}

	@Override
	protected Coordinate getTarget(UserCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
//		new CoordinateView("En", coordinate).interact();
		return coordinate;
	}

	@Override
	protected Coordinate getTarget(RandomCoordinateController coordinateController) {
		Coordinate coordinate = coordinateController.getTarget();
//		this.writeln("La máquina pone en " + coordinate);
//		this.readString("Pulse enter para continuar");
		return coordinate;
	}
	
	@Override
	protected Error validateTarget() {
		return this.getPutController().validateTarget(super.getTarget());
	}

	private PutController getPutController() {
		return (PutController) this.getColocateController();
	}

}
