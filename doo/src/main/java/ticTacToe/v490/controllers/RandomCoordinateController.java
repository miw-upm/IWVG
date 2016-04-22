package ticTacToe.v490.controllers;

import ticTacToe.v490.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
