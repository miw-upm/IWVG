package ticTacToe.v350;

public class ContinueView implements OperationView {

	private ContinueController continueController;
	
	public ContinueView(OperationController controller) {
		continueController = (ContinueController) controller;
	}

	@Override
	public void interact() {
		char answer;
		do {
			answer = new IO().readChar("Desea continuar? (s/n): ");
		} while (answer != 's' && answer != 'S' && answer != 'n'
				&& answer != 'N');
		continueController.setContinue(answer=='s' || answer=='S');
	}

}
