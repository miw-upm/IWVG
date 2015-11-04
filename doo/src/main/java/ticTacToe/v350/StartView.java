package ticTacToe.v350;

public class StartView implements OperationView {

	private StartController startController;
	
	public StartView(OperationController controller) {
		startController = (StartController) controller;
	}

	@Override
	public void interact() {
		int users = new LimitedIntDialog("Cuántos usuarios?", 0, 2).read();
		startController.setUsers(users);
		new BoardView(startController.getBoard()).write();
	}

}
