package ticTacToe.v400.controllers;

import ticTacToe.v400.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
