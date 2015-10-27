package ticTacToe.v060;

public class Token {
	
	private char value;
	
	public Token(char value){
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Token other = (Token) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	@Override
	public Token clone() {
		return new Token(value);
	}

	public char getValue() {
		return value;
	}
		
}
