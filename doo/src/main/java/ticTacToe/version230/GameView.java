package ticTacToe.version230;

public class GameView implements View {

	private ColocateControllerFactory colocateControllerFactory;

	public GameView(ColocateControllerFactory colocateControllerFactory) {
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void render() {
		ColocateController controller;
		do {
			controller = colocateControllerFactory.getController();
			if (controller != null) {
				controller.recibir(this);
			}
		} while (controller != null);
	}

	public void atender(ManualPutController manualPutController) {
		new ManualPutView(manualPutController).render();
	}

	public void atender(ManualMoveController manualMoveController) {
		new ManualMoveView(manualMoveController).render();
	}

	public void atender(AutomaticPutController automaticPutController) {
		new AutomaticPutView(automaticPutController).render();
	}

	public void atender(AutomaticMoveController automaticMoveController) {
		new AutomaticMoveView(automaticMoveController).render();
	}

}
