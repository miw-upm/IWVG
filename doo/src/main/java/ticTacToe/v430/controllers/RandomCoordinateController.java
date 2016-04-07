package ticTacToe.v430.controllers;

import ticTacToe.v430.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
