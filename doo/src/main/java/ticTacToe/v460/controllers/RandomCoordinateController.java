package ticTacToe.v460.controllers;

import ticTacToe.v460.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
