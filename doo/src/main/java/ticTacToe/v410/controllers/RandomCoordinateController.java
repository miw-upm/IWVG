package ticTacToe.v410.controllers;

import ticTacToe.v410.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
