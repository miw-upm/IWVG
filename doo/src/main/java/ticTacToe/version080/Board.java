package ticTacToe.version080;

public class Board {

	private Token[][] tokens;
	
	public Board() {
		tokens = new Token[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = new Token('_');
			}
		}
	}

	public void write() {
		IO io = new IO();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				io.write(tokens[i][j].getValue() + " ");
			}
			io.writeln();
		}
	}

	public boolean complete() {
		int contTokens = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!tokens[i][j].equals(new Token('_'))) {
					contTokens++;
				}
			}
		}
		return contTokens == 6;
	}
	
	public boolean existTicTacToe() {
		return this.existTicTacToe(new Token('x')) || this.existTicTacToe(new Token('o'));
	}

	public boolean existTicTacToe(Token token) {
		if (tokens[1][1].equals(token)){
			if (tokens[0][0].equals(token)){
				return tokens[2][2].equals(token);
			}
			if (tokens[0][2].equals(token)){
				return tokens[2][0].equals(token);
			}
			if (tokens[0][1].equals(token)){
				return tokens[2][1].equals(token);
			}
			if (tokens[1][0].equals(token)){
				return tokens[1][2].equals(token);
			}
			return false;
		}
		if (tokens[0][0].equals(token)){
			if (tokens[0][1].equals(token)){
				return tokens[0][2].equals(token);
			}
			if (tokens[1][0].equals(token)){
				return tokens[2][0].equals(token);
			}
			return false;
		}
		if (tokens[2][2].equals(token)){
			if (tokens[1][2].equals(token)){
				return tokens[0][2].equals(token);
			}
			if (tokens[2][1].equals(token)){
				return tokens[2][0].equals(token);
			}
			return false;
		}
		return false;
	}

	public boolean empty(int row, int column) {
		return tokens[row][column].equals(new Token('_'));
	}

	public void put(int row, int column, Token token) {
		tokens[row][column] = token;
	}

	public boolean full(int row, int column, Token token) {
		return tokens[row][column].equals(token);
	}

}

