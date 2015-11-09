package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
