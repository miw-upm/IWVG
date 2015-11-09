package ticTacToe.v090;

public class Turn {

	int value = 0;
	
	public Turn() {
		value = 0;
	}
	
    public int take() {
    	int result = value;
    	value = (value +1)% 2;
        return result;
    }
    
    public int notTake() {
    	return (value +1)% 2;
    }
	
}
