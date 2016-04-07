package ticTacToe.v480.controllers.remote.logic;

import java.util.List;

import ticTacToe.v480.controllers.remote.network.ClientNetwork;
import ticTacToe.v480.models.Color;
import ticTacToe.v480.models.Coordinate;

public class RemoteGame {

	public Color take() {
		return (Color) ClientNetwork.instance().sendReceive(GameFrameType.TAKE);
	}

	public void change() {
		ClientNetwork.instance().send(GameFrameType.CHANGE);
	}

	public boolean full(Coordinate origin) {
		return (boolean) ClientNetwork.instance().sendReceive(
				GameFrameType.FULL, origin);
	}

	public boolean empty(Coordinate target) {
		return (boolean) ClientNetwork.instance().sendReceive(
				GameFrameType.EMPTY, target);
	}

	public int getNumPlayers() {
		return (int) ClientNetwork.instance().sendReceive(
				GameFrameType.GET_NUM_PLAYERS);
	}

	public void put(Coordinate target) {
		ClientNetwork.instance().send(GameFrameType.PUT, target);
	}

	public void remove(Coordinate origin) {
		ClientNetwork.instance().send(GameFrameType.REMOVE, origin);
	}

	public void clear() {
		ClientNetwork.instance().send(GameFrameType.CLEAR);
	}

	public boolean complete() {
		return (boolean) ClientNetwork.instance().sendReceive(
				GameFrameType.COMPLETE);
	}

	public boolean existTicTacToe() {
		return (boolean) ClientNetwork.instance().sendReceive(
				GameFrameType.EXIST_TICTACTOE);
	}

	public Color getColor(Coordinate coordinate) {
		return (Color) ClientNetwork.instance().sendReceive(
				GameFrameType.GET_COLOR, coordinate);
	}

	@SuppressWarnings("unchecked")
	public List<Coordinate> emptyCoordinates() {
		return (List<Coordinate>) ClientNetwork.instance().sendReceive(
				GameFrameType.EMPTY_COORDINATES);
	}

	@SuppressWarnings("unchecked")
	public List<Coordinate> playerCoordinates() {
		return (List<Coordinate>) ClientNetwork.instance().sendReceive(
				GameFrameType.PLAYER_COORDINATES);
	}
}
