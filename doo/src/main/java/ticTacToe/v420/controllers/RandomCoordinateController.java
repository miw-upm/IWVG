package ticTacToe.v420.controllers;

import ticTacToe.v420.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
