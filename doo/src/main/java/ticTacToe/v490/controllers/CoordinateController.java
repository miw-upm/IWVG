package ticTacToe.v490.controllers;

import ticTacToe.v490.models.Coordinate;

public interface CoordinateController {
	
	Coordinate getOrigin();

	Coordinate getTarget();

	void accept(CoordinateControllerVisitor coordinateControllerVisitor);

}
