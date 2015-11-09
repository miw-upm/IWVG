package ticTacToe.v170;

public class Turn {

	private int value = 0;
	
	private int limit;
	
	public Turn(int limit) {
		value = 0;
		this.limit = limit;
	}
	
    public int take() {
        return value;
    }
    
    public int notTake() {
    	return (value +1)% limit;
    }
    
    public void change() {
    	value = this.notTake();
    }
	
}
