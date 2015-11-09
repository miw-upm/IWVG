package ticTacToe.v370.controllers;

import ticTacToe.v370.models.Coordinate;

public interface MoveController extends ColocateController {

	Error validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	Error validateTarget(Coordinate origin, Coordinate target);

}
