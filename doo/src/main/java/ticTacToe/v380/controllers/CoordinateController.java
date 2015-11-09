package ticTacToe.v380.controllers;

import ticTacToe.v380.models.Coordinate;

public interface CoordinateController {
	
	Coordinate getOrigin();

	Coordinate getTarget();

	void accept(CoordinateControllerVisitor coordinateControllerVisitor);

}
