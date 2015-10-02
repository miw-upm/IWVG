package ticTacToe.version230;

public class StartView {

	private StartController startController;
	
	public StartView(StartController startController){
		this.startController = startController;
	}
	
	public void render(){
		int numPlayers = new LimitedIntDialog("Cuantos usuarios jugarán?", 0,
				TicTacToe.NUM_PLAYERS).read();
		startController.control(numPlayers);
		new BoardView(startController.getBoard()).render();
	}
}
