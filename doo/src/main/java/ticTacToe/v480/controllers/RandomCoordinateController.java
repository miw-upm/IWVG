package ticTacToe.v480.controllers;

import ticTacToe.v480.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
