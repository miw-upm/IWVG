package chess;

public class Turn {

	private int value;
	
	private static final int NUM_PLAYERS = 2;

	public Turn() {
		value = 0;
	}

	public int take() {
		return value;
	}
	
    public void change() {
    	value = (value +1)% NUM_PLAYERS;
    }

}
