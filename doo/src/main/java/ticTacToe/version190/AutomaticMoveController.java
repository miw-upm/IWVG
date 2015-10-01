package ticTacToe.version190;

public class AutomaticMoveController extends AutomaticColocateController implements MoveController {

	protected AutomaticMoveController(Board board, Turn turn){
		super(board, turn, "Pone");
	}
	
	protected void colocate(){
		Color color = Color.values()[turn.take()];
		Coordinate origin;
		do {
			origin = Coordinate.random();
		} while (!board.full(origin, color));
		IO io = new IO();
		io.writeln("Se va a retirar un " + color.getValue() + " de " + origin);
		io.readString("Pulse <Enter> para continuar");
		board.remove(origin, color);
		this.put(color, origin);
	}
}
