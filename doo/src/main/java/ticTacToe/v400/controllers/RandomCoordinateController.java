package ticTacToe.v400.controllers;

import ticTacToe.v400.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
