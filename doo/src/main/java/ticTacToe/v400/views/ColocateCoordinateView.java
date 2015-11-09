package ticTacToe.v400.views;

import ticTacToe.v400.controllers.CoordinateControllerVisitor;
import ticTacToe.v400.models.Coordinate;
import ticTacToe.v400.utils.IO;

abstract class ColocateCoordinateView implements CoordinateControllerVisitor {

	private IO io;
	
	protected ColocateCoordinateView(){
		io = new IO();
	}
	
	abstract Coordinate getCoordinate();
	
	protected void show(String infix, Coordinate coordinate){
		io.writeln("La máquina " + infix + " " + coordinate);
		io.readString("Pulse enter para continuar");
	}
}
