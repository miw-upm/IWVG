package ticTacToe.v340.views;

import ticTacToe.v340.controllers.ColocateController;
import ticTacToe.v340.controllers.Error;
import ticTacToe.v340.controllers.UserCoordinateController;
import ticTacToe.v340.models.Coordinate;
import ticTacToe.v340.utils.IO;
import ticTacToe.v340.controllers.RandomCoordinateController;

public abstract class ColocateView {

	private IO io;
	
	private ColocateController colocateController;
	
	private Coordinate target;

	protected ColocateView(ColocateController colocateController) {
		assert colocateController != null;
		this.colocateController = colocateController;
		io = new IO();
	}
	
	public abstract void interact();
	
	void interact(String title) {
		this.writeln(title + " el jugador " + colocateController.take());
		this.colocate();
		new BoardView(colocateController).write();
		if (colocateController.existTicTacToe()) {
			this.writeln("Victoria!!!! " + colocateController.take()
					+ "! " + colocateController.take() + "! "
					+ colocateController.take() + "! Victoria!!!!");
		}
	}

	protected abstract void colocate();
	
	protected void put(){
		Error error = null;
		do {
			target = this.getTarget();
			error = this.validateTarget();
			if (error != null) {
				this.writeln("" + error);
			}
		} while (error != null);
		colocateController.put(target);
	}

	protected Coordinate getTarget() {
		return target;
	}

	protected abstract Coordinate getTarget(UserCoordinateController coordinateController);
	
	protected abstract Coordinate getTarget(RandomCoordinateController coordinateController);
	
	protected abstract Error validateTarget();
	
	protected void writeln(String string){
		io.writeln(string);
	}
	
	protected void readString(String string) {
		io.readString(string);		
	}
	
	protected ColocateController getColocateController(){
		return colocateController;
	}
}
