package ticTacToe.v360.controllers;

import ticTacToe.v360.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
