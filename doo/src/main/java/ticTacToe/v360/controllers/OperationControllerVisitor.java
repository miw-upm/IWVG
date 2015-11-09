package ticTacToe.v360.controllers;

import ticTacToe.v360.controllers.ContinueController;
import ticTacToe.v360.controllers.MoveController;
import ticTacToe.v360.controllers.PutController;
import ticTacToe.v360.controllers.StartController;

public interface OperationControllerVisitor {

	void visit(StartController startController);
	
	void visit(PutController putController);
	
	void visit(MoveController moveController);
	
	void visit(ContinueController continueController);

}

