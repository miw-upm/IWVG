package ticTacToe.v450.controllers;

import ticTacToe.v450.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
