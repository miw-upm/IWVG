package ticTacToe.v380.controllers;

import ticTacToe.v380.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
