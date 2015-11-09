package ticTacToe.v030;

public class TTT {
	
	private char[][] box; 
	
	public static char[] color = { 'x', 'o' }; 
	
	private int zeroOrOne;
	
	private Start s; 
	
	private Put p; 
	
	private Move m; 

	public TTT() { 
		zeroOrOne = 0;
		box = new char[3][3];
		s = new Start(box);
		p = new Put(box);
	}

	public void exec() {
		do {
			s.write();
			if (!this.complete()) {
				p.put(zeroOrOne, this);
			} else {
				m.move(zeroOrOne, this);
			}
			zeroOrOne = (zeroOrOne + 1) % 2;
		} while (!this.existTTT());
		s.write();
		this.message(zeroOrOne);
	}

	public boolean complete() {
		int c = 0;
		for (int contRow = 0; contRow < 3; contRow++) {
			for (int contColumn = 0; contColumn < 3; contColumn++) {
				if (box[contRow][contColumn] != '_') {
					c++;
				}
			}
		}
		return c == 6;
	}

	public boolean existTTT() {
		return this.existTTT('x') || this.existTTT('o');
	}

	public boolean existTTT(char token) {
		if (box[1][1] == token) {
			if (box[0][0] == token) {
				return box[2][2] == token;
			}
			if (box[0][2] == token) {
				return box[2][0] == token;
			}
			if (box[0][1] == token) {
				return box[2][1] == token;
			}
			if (box[1][0] == token) {
				return box[1][2] == token;
			}
			return false;
		}
		if (box[0][0] == token) {
			if (box[0][1] == token) {
				return box[0][2] == token;
			}
			if (box[1][0] == token) {
				return box[2][0] == token;
			}
			return false;
		}
		if (box[2][2] == token) {
			if (box[1][2] == token) {
				return box[0][2] == token;
			}
			if (box[2][1] == token) {
				return box[2][0] == token;
			}
			return false;
		}
		return false;
	}

	public boolean empty(int r, int c) {
		return box[r][c] == '_';
	}

	public boolean full(int r, int c, char t) {
		return box[r][c] == t;
	}

	public void clear() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				box[i][j] = '_';
			}
		}
	}

	public void message(int turn) {
		turn = (turn + 1) % 2;
		System.out.println("Victoria!!!! " + TTT.color[turn] + "! "
				+ TTT.color[turn] + "! " + TTT.color[turn] + "! Victoria!!!!");
	}

	public static void main(String[] args) {
		new TTT().exec();
	}
}
