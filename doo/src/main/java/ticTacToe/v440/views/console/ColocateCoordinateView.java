package ticTacToe.v440.views.console;

import ticTacToe.v440.controllers.CoordinateController;
import ticTacToe.v440.controllers.CoordinateControllerVisitor;
import ticTacToe.v440.models.Coordinate;
import ticTacToe.v440.utils.IO;

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
