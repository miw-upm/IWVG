package ticTacToe.v380.controllers;

import ticTacToe.v380.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
