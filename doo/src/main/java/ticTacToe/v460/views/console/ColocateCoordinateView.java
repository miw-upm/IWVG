package ticTacToe.v460.views.console;

import ticTacToe.v460.controllers.CoordinateController;
import ticTacToe.v460.controllers.CoordinateControllerVisitor;
import ticTacToe.v460.models.Coordinate;
import ticTacToe.v460.utils.IO;

abstract class ColocateCoordinateView implements CoordinateControllerVisitor {

	private CoordinateController coordinateController;
	
	protected ColocateCoordinateView(CoordinateController coordinateController){
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}
	
	abstract Coordinate getCoordinate();
	
	protected void show(String infix, Coordinate coordinate){
		CoordinateView.instance().write("La máquina " + infix + " ", coordinate);
		IO.instance().readString(". Pulse enter para continuar");
	}
	
	protected CoordinateController getCoordinateController(){
		return coordinateController;
	}
}
