package ticTacToe.version120;

public class Turn {

	int value = 0;
	
	public Turn() {
		value = 0;
	}
	
    public int take() {
    	int result = value;
    	value = (value +1)% TicTacToe.NUM_PLAYERS;
        return result;
    }
    
    public int notTake() {
    	return (value +1)% TicTacToe.NUM_PLAYERS;
    }
	
}
