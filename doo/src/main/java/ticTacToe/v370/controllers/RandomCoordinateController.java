package ticTacToe.v370.controllers;

import ticTacToe.v370.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
