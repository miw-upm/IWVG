package ticTacToe.v170;

public class Turn {

	private int value = 0;
	
	private Player[] players;
	
	public Turn(Player[] players) {
		assert players != null;
		for(Player player : players){
			assert player != null;
		}
		value = 0;
		this.players = players;
	}
	
    public Player take() {
        return players[value];
    }
    
    public Player notTake() {
    	return players[this.other()];
    }
    
    private int other() {
    	return (value +1)% TicTacToe.NUM_PLAYERS;
    }
    
    public void change() {
    	value = this.other();
    }
	
}
