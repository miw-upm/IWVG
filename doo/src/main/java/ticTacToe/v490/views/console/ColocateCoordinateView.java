package ticTacToe.v490.views.console;

import ticTacToe.v490.controllers.CoordinateController;
import ticTacToe.v490.controllers.CoordinateControllerVisitor;
import ticTacToe.v490.models.Coordinate;
import ticTacToe.v490.utils.IO;

abstract class ColocateCoordinateView implements CoordinateControllerVisitor {

	private CoordinateController coordinateController;
	
	protected ColocateCoordinateView(CoordinateController coordinateController){
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}
	
	abstract Coordinate getCoordinate();
	
	protected void show(String infix, Coordinate coordinate){
		CoordinateView.instance().write("La m�quina " + infix + " ", coordinate);
		IO.instance().readString(". Pulse enter para continuar");
	}
	
	protected CoordinateController getCoordinateController(){
		return coordinateController;
	}
}
