package ticTacToe.v470.controllers;

import ticTacToe.v470.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
