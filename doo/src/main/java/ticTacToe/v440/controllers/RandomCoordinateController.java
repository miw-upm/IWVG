package ticTacToe.v440.controllers;

import ticTacToe.v440.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
