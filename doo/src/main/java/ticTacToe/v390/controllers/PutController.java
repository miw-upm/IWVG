package ticTacToe.v390.controllers;

import ticTacToe.v390.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
