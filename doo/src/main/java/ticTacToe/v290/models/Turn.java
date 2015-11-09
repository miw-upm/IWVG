package ticTacToe.v290.models;

public class Turn {

	private int value = 0;
	
	public Turn() {
		value = 0;
	}
	
    public Color take() {
        return Color.values()[value];
    }
    
    public Color notTake() {
    	return Color.values()[this.other()];
    }
    
    private int other() {
    	return (value +1)% (Color.values().length-1);
    }
    
    public void change() {
    	value = this.other();
    }
	
}
