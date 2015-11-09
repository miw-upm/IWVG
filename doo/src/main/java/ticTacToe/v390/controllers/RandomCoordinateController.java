package ticTacToe.v390.controllers;

import ticTacToe.v390.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
