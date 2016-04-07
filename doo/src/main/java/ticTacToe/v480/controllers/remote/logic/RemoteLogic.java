package ticTacToe.v480.controllers.remote.logic;

import ticTacToe.v480.Logic;
import ticTacToe.v480.controllers.remote.RemoteOperationController;
import ticTacToe.v480.controllers.remote.network.ClientNetwork;
import ticTacToe.v480.models.Observer;

public class RemoteLogic implements Logic, Observer {

	public RemoteLogic() {
	}

	public void initialize() {
		ClientNetwork.instance().send(LogicFrameType.INITIALIZE);
	}

	public void begin() {
		ClientNetwork.instance().send(LogicFrameType.BEGIN);
	}

	public void end() {
		ClientNetwork.instance().send(LogicFrameType.END);
	}

	public void exit() {
		ClientNetwork.instance().send(LogicFrameType.EXIT);
	}

	public RemoteOperationController getOperationController() {
		return (RemoteOperationController) ClientNetwork.instance()
				.sendReceive(LogicFrameType.GET_OPERATION_CONTROLLER);
	}

}
