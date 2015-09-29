package ticTacToe.version10;

public class PutController {

	private Board board;
	
	private Player player;
	
	public PutController(Board board, Player player) {
		this.board = board;
		this.player = player;
	}

	public void control() {
		IO io = new IO();
		io.writeln("Pone el jugador " + player.getToken().getValue());
		Coordinate coordinate = new Coordinate();
		boolean ok;
		do {
			io.writeln("En qué casilla?");
			coordinate.read();
			ok = board.empty(coordinate);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(coordinate, player.getToken());
		board.write();
		if (board.existTicTacToe()){
			player.win();
		}
	}
}
