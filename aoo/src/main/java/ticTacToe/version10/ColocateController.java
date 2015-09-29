package ticTacToe.version10;

public abstract class ColocateController {
	
	protected Board board;
	
	protected Player player;
	
	protected String title;
	
	protected IO io = new IO();
		
	protected ColocateController(Board board, Player player, String action) {
		this.board = board;
		this.player = player;
		title = action + " el jugador " + player.getToken().getValue();
	}	
	
	public void control(String prefix, Coordinate forbidden){
		Coordinate target = new Coordinate();
		boolean ok;
		do {
			io.writeln(prefix + " qué casilla?");
			target.read();
			ok = board.empty(target) && target.equals(forbidden);
			if (!ok) {
				io.writeln("Esa casilla no está vacía");
			}
		} while (!ok);
		board.put(target, player.getToken());
		board.write();
		if (board.existTicTacToe()){
			player.win();
		}
	}
	
//	public void control() {
//		this.writeTitle();
//		this.prePut();
//		this.put();
//		this.end();
//		
//	}
//
//	private void end() {
//		board.write();
//		if (board.existTicTacToe()){
//			player.win();
//		}
//	}
//
//	protected abstract void prePut();
//
//	private void put() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	protected abstract void writeTitle() ;
}
