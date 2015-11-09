package ticTacToe.v360.controllers;

import ticTacToe.v360.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
