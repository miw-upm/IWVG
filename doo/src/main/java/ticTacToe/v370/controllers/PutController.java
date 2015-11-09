package ticTacToe.v370.controllers;

import ticTacToe.v370.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
