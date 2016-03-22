package ticTacToe.v220;

class Turn {

	private int value = 0;
	
	public Turn() {
		value = 0;
	}
	
    public Color take() {
        return Color.values()[value];
    }
    
    public void change() {
    	value = (value +1)% (Color.values().length-1);
    }
	
}
