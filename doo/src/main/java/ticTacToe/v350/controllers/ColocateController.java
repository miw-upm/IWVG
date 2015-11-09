package ticTacToe.v350.controllers;

import ticTacToe.v350.models.Color;
import ticTacToe.v350.models.Coordinate;

public interface ColocateController extends OperationController {
	
	Color take();
	
	void put(Coordinate target);

	boolean existTicTacToe();
		
	CoordinateController getCoordinateController();
	
}
