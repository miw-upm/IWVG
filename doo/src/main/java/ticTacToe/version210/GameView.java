package ticTacToe.version210;

public class GameView {

	private ColocateControllerFactory colocateControllerFactory;

	public GameView(ColocateControllerFactory colocateControllerFactory) {
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void render() {
		ColocateController colocateController;
		do {
			colocateController = colocateControllerFactory.getColocateController();
			if (colocateController != null) {
				if (colocateController instanceof ManualPutController) {
					new ManualPutView(colocateController).render();
				} else if (colocateController instanceof AutomaticPutController) {
					new AutomaticPutView(colocateController).render();
				} else if (colocateController instanceof ManualMoveController) {
					new ManualMoveView(colocateController).render();
				} else if (colocateController instanceof AutomaticMoveController) {
					new AutomaticMoveView(colocateController).render();
				}
			}
		} while (colocateController != null);
	}
}
