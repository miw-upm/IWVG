package ticTacToe.version10;

public class MoveController extends ColocateController{

	public MoveController(Board board, Player player) {
		super(board, player, "Mueve");
	}

	public void control() {
		io.writeln(title);
		Coordinate origin = new Coordinate();
		boolean ok;
		do {
			io.writeln("De qué casilla?");
			origin.read();
			ok = board.full(origin, player.getToken());
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		board.put(origin, new Token('_'));
		this.control("A", origin);
	}
}
