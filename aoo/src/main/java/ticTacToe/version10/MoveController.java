package ticTacToe.version10;

public class MoveController {

	private Board board;
	
	private Player player;
	
	public MoveController(Board board, Player player) {
		this.board = board;
		this.player = player;
	}

	public void control() {
		IO io = new IO();
		io.writeln("Mueve el jugador " + player.getToken().getValue());
		Coordinate origin = new Coordinate();
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			io.writeln("De qué casilla?");
			origin.read();
			ok = board.full(origin, player.getToken());
			if (!ok) {
				io.writeln("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			io.writeln("A qué casilla?");
			target.read();
			ok = board.empty(target);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(origin, new Token('_'));
		board.put(target, player.getToken());
		board.write();
		if (board.existTicTacToe()){
			player.win();
		}
	}
}
