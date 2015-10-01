package ticTacToe.version210;

public class GameView {

	private ColocateControllerFactory colocateControllerFactory;

	public GameView(ColocateControllerFactory colocateControllerFactory) {
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void render() {
		Controller controller;
		do {
			controller = colocateControllerFactory.getController();
			if (controller != null) {
				if (controller instanceof ManualPutController) {
					new ManualPutView(controller).render();
				} else if (controller instanceof AutomaticPutController) {
					new AutomaticPutView(controller).render();
				} else if (controller instanceof ManualMoveController) {
					new ManualMoveView(controller).render();
				} else if (controller instanceof AutomaticMoveController) {
					new AutomaticMoveView(controller).render();
				}
			}
		} while (controller != null);
	}
}
