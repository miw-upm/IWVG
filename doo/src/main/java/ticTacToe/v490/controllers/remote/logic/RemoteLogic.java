package ticTacToe.v490.controllers.remote.logic;

import ticTacToe.v490.Logic;
import ticTacToe.v490.controllers.remote.RemoteOperationController;
import ticTacToe.v490.controllers.remote.network.ClientNetwork;
import ticTacToe.v490.models.Observer;

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
		StateType stateType = (StateType) ClientNetwork.instance()
				.sendReceive(LogicFrameType.GET_STATE);
		return null;
	}

}
