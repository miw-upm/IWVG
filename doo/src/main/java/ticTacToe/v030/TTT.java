package ticTacToe.v030;

public class TTT {

	private char[][] aac_Tokens;

	public static char[] COLOR = { 'x', 'o' };

	private int zero_one;

	private Start Start;

	private Put Put_Piece;

	private Move Move_Piece;

	public TTT() {
		zero_one = 0;
		aac_Tokens = new char[3][3];
		Start = new Start(aac_Tokens);
		Put_Piece = new Put(aac_Tokens);
	}

	public void process() {
		do {
			Start.output();
			if (!this.Complete()) {
				Put_Piece.exec(zero_one, this);
			} else {
				Move_Piece.execute(zero_one, this);
			}
			zero_one = (zero_one + 1) % 2;
		} while (!this.ole());
		Start.output();
		this.show(zero_one);
	}

	public boolean Complete() {
		int cont = 0;
		for (int cont1 = 0; cont1 < 3; cont1++) {
			for (int cont2 = 0; cont2 < 3; cont2++) {
				if (aac_Tokens[cont1][cont2] != '_') {
					cont++;
				}
			}
		}
		return cont == 6;
	}

	public boolean ole() {
		return this.existTicTacToe('x') || this.existTicTacToe('o');
	}

	public boolean existTicTacToe(char token) {
		if (aac_Tokens[1][1] == token) {
			if (aac_Tokens[0][0] == token) {
				return aac_Tokens[2][2] == token;
			}
			if (aac_Tokens[0][2] == token) {
				return aac_Tokens[2][0] == token;
			}
			if (aac_Tokens[0][1] == token) {
				return aac_Tokens[2][1] == token;
			}
			if (aac_Tokens[1][0] == token) {
				return aac_Tokens[1][2] == token;
			}
			return false;
		}
		if (aac_Tokens[0][0] == token) {
			if (aac_Tokens[0][1] == token) {
				return aac_Tokens[0][2] == token;
			}
			if (aac_Tokens[1][0] == token) {
				return aac_Tokens[2][0] == token;
			}
			return false;
		}
		if (aac_Tokens[2][2] == token) {
			if (aac_Tokens[1][2] == token) {
				return aac_Tokens[0][2] == token;
			}
			if (aac_Tokens[2][1] == token) {
				return aac_Tokens[2][0] == token;
			}
			return false;
		}
		return false;
	}

	public boolean empty(int r, int c) {
		return aac_Tokens[r][c] == '_';
	}

	public boolean full(int row, int column, char player) {
		return aac_Tokens[row][column] == player;
	}

	public void clear() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				aac_Tokens[i][j] = '_';
			}
		}
	}

	public void show(int turn) {
		System.out.println("Victoria!!!! " + TTT.COLOR[turn] + "! "
				+ TTT.COLOR[turn] + "! " + TTT.COLOR[turn] + "! Victoria!!!!");
	}

	public static void main(String[] args) {
		new TTT().process();
	}
}
