package ticTacToe.v280.controllers;

import ticTacToe.v280.models.Game;
import ticTacToe.v280.models.State;
import ticTacToe.v280.models.Coordinate;
import ticTacToe.v280.utils.IO;

public abstract class ColocateController extends Controller {

	private String actionTitle;
	
	private Coordinate target;

	protected ColocateController(Game game, String actionTitle) {
		super(game);
		assert actionTitle != null;
		this.actionTitle = actionTitle;
	}

	public void control() {
		assert this.getState() == State.IN_GAME;
		IO io = new IO();
		io.writeln(actionTitle + " el jugador " + this.getTurn().take());
		this.colocate();
		this.getBoard().write();
		if (this.getBoard().existTicTacToe(this.getTurn().take())) {
			io.writeln("Victoria!!!! " + this.getTurn().take() + "! " + this.getTurn().take()
					+ "! " + this.getTurn().take() + "! Victoria!!!!");
			this.setState(State.FINAL);
		} else {
			this.getTurn().change();
		}
	}

	protected abstract void colocate();
	
	protected void put(String targetTitle) {
		Error error;
		do {
			target = this.selectTarget(targetTitle);
			error = this.validateTarget();
			if (error != null){
				new IO().writeln(""+error);
			}
		} while (error != null);	
		this.getBoard().put(target, this.getTurn().take());
	}
	
	protected abstract Coordinate selectTarget(String targetTitle);

	protected Error validateTarget(){
		if (!this.getBoard().empty(target)) {
			return Error.NOT_EMPTY;
		}
		return null;
	}
	
	protected Coordinate getTarget(){
		return target;
	}

}
