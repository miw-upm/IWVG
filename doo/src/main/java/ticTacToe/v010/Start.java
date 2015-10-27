package ticTacToe.v010;

public class Start {

	private char[][] tokens;
	
	public Start(char[][] tokens){
		this.tokens = tokens;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = '_';
			}
		}
	}
	
	public void write() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tokens[i][j] + " ");
			}
			System.out.println();
		}
	}
}
