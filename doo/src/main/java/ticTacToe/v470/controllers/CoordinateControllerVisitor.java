package ticTacToe.v470.controllers;

public interface CoordinateControllerVisitor {

	void visit(UserCoordinateController userCoordinateController);
	
	void visit(RandomCoordinateController randomCoordinateController);
}
