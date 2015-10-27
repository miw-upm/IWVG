package ticTacToe.v040;

public class TicTacToe {

	private char[][] tokens;

	public static char[] COLOR = { 'x', 'o' };
	
	private int turn;
	
	private Start start;
	
	private Put put;
	
	private Move move;

	public TicTacToe() {
		turn = 0;
		tokens = new char[3][3];
		start = new Start(tokens);
		put = new Put(tokens);
	}

	public void play() {
		do {
			start.write();
			if (!this.complete()) {
				put.put(turn, this);
			} else {
				move.move(turn, this);
			}
			turn = (turn + 1) % 2;
		} while (!this.existTicTacToe());
		start.write();
		this.win(turn);
	}

	public boolean complete() {
		int contTokens = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tokens[i][j]!='_') {
					contTokens++;
				}
			}
		}
		return contTokens == 6;
	}

	public boolean existTicTacToe() {
		return this.existTicTacToe('x')
				|| this.existTicTacToe('o');
	}

	public boolean existTicTacToe(char token) {
		if (tokens[1][1]==token) {
			if (tokens[0][0]==token) {
				return tokens[2][2]==token;
			}
			if (tokens[0][2]==token) {
				return tokens[2][0]==token;
			}
			if (tokens[0][1]==token) {
				return tokens[2][1]==token;
			}
			if (tokens[1][0]==token) {
				return tokens[1][2]==token;
			}
			return false;
		}
		if (tokens[0][0]==token) {
			if (tokens[0][1]==token) {
				return tokens[0][2]==token;
			}
			if (tokens[1][0]==token) {
				return tokens[2][0]==token;
			}
			return false;
		}
		if (tokens[2][2]==token) {
			if (tokens[1][2]==token) {
				return tokens[0][2]==token;
			}
			if (tokens[2][1]==token) {
				return tokens[2][0]==token;
			}
			return false;
		}
		return false;
	}

	public boolean empty(int row, int column) {
		return tokens[row][column]=='_';
	}

	public boolean full(int row, int column, char token) {
		return tokens[row][column]==token;
	}

	public void clear() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = '_';
			}
		}
	}

	public void win(int turn) {
		System.out.println("Victoria!!!! " + TicTacToe.COLOR[turn] + "! "
				+ TicTacToe.COLOR[turn] + "! " + TicTacToe.COLOR[turn]
				+ "! Victoria!!!!");
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
