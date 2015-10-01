package ticTacToe.version180;

public class MoveController extends ColocateController {
	
	protected MoveController(Board board, Turn turn){
		super(board, turn, "Mueve");
	}
	
	protected void colocate() {
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			origin.read("De");
			ok = board.full(origin, Color.values()[turn.take()]);
			if (!ok) {
				new IO().writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		board.remove(origin, Color.values()[turn.take()]);
		this.put(Color.values()[turn.take()], "A", origin);
	}
}
