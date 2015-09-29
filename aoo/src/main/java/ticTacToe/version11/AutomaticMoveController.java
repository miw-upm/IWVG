package ticTacToe.version11;

public class AutomaticMoveController extends ColocateController {

	public AutomaticMoveController(Board board, Player player) {
		super(board, player);
	}
	
	public void control(){
		IO io = new IO();
		io.writeln("Mueve el jugador " + player.getToken().getValue());
		Coordinate origin = board.firstCoordinateFull(player.getToken());
		io.writeln("De la casilla: " + origin.toString());
		Coordinate target = board.firstCoordinateEmpty();
		io.writeln("A la casilla: " + target.toString());
		board.put(origin, new Token('_'));
		board.put(target, player.getToken());
		board.write();
		if (board.existTicTacToe()){
			player.win();
		}
	}
}
