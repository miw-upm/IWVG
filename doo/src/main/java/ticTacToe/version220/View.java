package ticTacToe.version220;

public interface View {

	void render();

	void atender(ManualPutController manualPutController);

	void atender(ManualMoveController manualMoveController);
	
	void atender(AutomaticPutController automaticPutController);

	void atender(AutomaticMoveController automaticMoveController);
}
