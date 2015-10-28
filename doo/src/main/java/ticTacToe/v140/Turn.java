package ticTacToe.v140;

public class Turn {

	int value = 0;
	
	public Turn() {
		value = 0;
	}
	
    public int take() {
        return value;
    }
    
    public int notTake() {
    	return (value +1)% TicTacToe.NUM_PLAYERS;
    }
    
    public void change() {
    	value = this.notTake();
    }
	
}
