package ticTacToe.v400.controllers;

import ticTacToe.v400.models.Coordinate;

public interface CoordinateController {
	
	Coordinate getOrigin();

	Coordinate getTarget();

	void accept(CoordinateControllerVisitor coordinateControllerVisitor);

}
