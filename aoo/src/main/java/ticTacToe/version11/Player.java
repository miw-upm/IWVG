package ticTacToe.version11;

public class Player {

	Token token;

	public Player(char character) {
		token = new Token(character);
	}
	
	public Token getToken(){
		return token;
	}

	public void win() {
		new IO().writeln("Victoria!!!! " + token.getValue() + "! " + token.getValue() + "! " + token.getValue() + "!!!!! Victoria!!!!");		
	}

}
