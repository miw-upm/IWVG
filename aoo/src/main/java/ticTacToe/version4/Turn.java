package ticTacToe.version4;

public class Turn {

	int value = 0;
	
    public int take() {
        return value;
    }
    
	public int notTake() {
		return (value +1)% 2;
	}

    public void change() {
        value = (value +1)% 2;    
    }
}
