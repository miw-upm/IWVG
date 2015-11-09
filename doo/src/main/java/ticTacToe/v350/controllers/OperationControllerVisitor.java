package ticTacToe.v350.controllers;

import ticTacToe.v350.controllers.ContinueController;
import ticTacToe.v350.controllers.MoveController;
import ticTacToe.v350.controllers.PutController;
import ticTacToe.v350.controllers.StartController;

public interface OperationControllerVisitor {

	void visit(StartController startController);
	
	void visit(PutController putController);
	
	void visit(MoveController moveController);
	
	void visit(ContinueController continueController);

}

