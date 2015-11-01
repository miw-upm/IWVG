package ticTacToe.v260;

public class TicTacToeView {

	private Logic logic;
	
	public TicTacToeView(Logic logic){
		this.logic = logic;
	}

	public void interact() {
		OperationController controller;
		do {
			controller = logic.getController();
			OperationView operationView = null;
			if (controller != null){
				if (controller instanceof StartController) {
					operationView = new StartView(controller);
				} else if (controller instanceof PutController) {
					operationView = new PutView(controller);
				} else if (controller instanceof MoveController) {
					operationView = new MoveView(controller);
				} else if (controller instanceof ContinueController) {
					operationView = new ContinueView(controller);
				} 
				operationView.interact();
			}
		} while (controller != null);
	}
}
