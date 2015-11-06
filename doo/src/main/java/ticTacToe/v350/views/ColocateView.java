package ticTacToe.v350.views;

import ticTacToe.v350.controllers.ColocateController;
import ticTacToe.v350.utils.IO;

public abstract class ColocateView {

	private IO io;
	
	private ColocateController colocateController;

	protected ColocateView(ColocateController colocateController) {
		assert colocateController != null;
		this.colocateController = colocateController;
		io = new IO();
	}

	protected void writeln(String string){
		io.writeln(string);
	}
	
	protected void readString(String string) {
		io.readString(string);		
	}
	
	protected ColocateController getColocateController(){
		return colocateController;
	}
}
