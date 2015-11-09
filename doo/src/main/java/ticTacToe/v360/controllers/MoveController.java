package ticTacToe.v360.controllers;

import ticTacToe.v360.models.Coordinate;

public interface MoveController extends ColocateController {

	Error validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	Error validateTarget(Coordinate origin, Coordinate target);

}
