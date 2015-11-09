package ticTacToe.v390.controllers;

import ticTacToe.v390.models.Coordinate;

public interface CoordinateController {
	
	Coordinate getOrigin();

	Coordinate getTarget();

	void accept(CoordinateControllerVisitor coordinateControllerVisitor);

}
