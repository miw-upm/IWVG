package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Coordinate;

public interface MoveController extends ColocateController {

	Error validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	Error validateTarget(Coordinate origin, Coordinate target);

}
