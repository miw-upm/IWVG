package ticTacToe.v330.models;

public enum Color {
	XS('x'),
	OS('o'),
	NONE('_');
	
	private char value;
	
	private Color(char value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return ""+value;
	}
}
