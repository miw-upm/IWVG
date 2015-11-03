package ticTacToe.v270;

public class PutView implements OperationView {

	private PutController putController;
	
	public PutView(OperationController controller) {
		putController = (PutController) controller;
	}

	@Override
	public void interact() {
		putController.control();
		
	}

}
