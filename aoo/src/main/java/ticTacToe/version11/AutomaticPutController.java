package ticTacToe.version11;

public class AutomaticPutController extends ColocateController {

	public AutomaticPutController(Board board, Player player) {
		super(board, player);
	}

	public void control(){
		IO io = new IO();
		io.writeln("Pone el jugador " + player.getToken().getValue());
		Coordinate coordinate = board.firstCoordinateEmpty();
		io.writeln("En la casilla: " + coordinate.toString());
		board.put(coordinate, player.getToken());
		board.write();
		if (board.existTicTacToe()){
			player.win();
		}
	}
}
