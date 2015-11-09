package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
