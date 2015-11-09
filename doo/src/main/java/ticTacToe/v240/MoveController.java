package ticTacToe.v240;

import ticTacToe.v240.utils.IO;

public class MoveController extends ColocateController {

	private Coordinate origin;
	
	public MoveController(Turn turn, Board board) {
		super(turn, board);
	}
	
	@Override
	public void control() {
		this.control("Mueve", "A");
	}

	@Override
	protected void colocate(String targetTitle) {
		this.remove();
		this.put(targetTitle);
	}
	
	private void remove(){
		origin = new Coordinate();
		boolean ok;
		do {
			origin.read("De");
			ok = this.errorToMove();
		} while (!ok);
		this.getBoard().remove(origin, this.getTurn().take());
	}
	
	private boolean errorToMove(){
		boolean ok = this.getBoard().full(origin, this.getTurn().take());
		if (!ok) {
			new IO().writeln("Esa casilla no está ocupada por ninguna de tus fichas");
		}
		return ok;
	}

	@Override
	protected boolean errorToPut() {
		boolean ok = super.errorToPut();
		if (ok){
			ok = !origin.equals(this.getTarget());
			if (!ok) {
				new IO().writeln("No se puede poner de donde se quitó");
			}
		}
		return ok;
	}

}
