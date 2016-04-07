package ticTacToe.v410.controllers;

import ticTacToe.v410.models.Coordinate;

public interface PutController extends ColocateController {

	Error validateTarget(Coordinate target);

}
