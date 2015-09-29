package ticTacToe.version0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TicTacToe {

	private char[][] tokens;

	private char[] players;

	private BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(System.in));

	public TicTacToe() {
		tokens = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = '_';
			}
		}
		players = new char[] { 'x', 'o' };
	}

	public void play() {
		int turn = 0;
		do {
			this.writeBoard();
			if (!this.completeBoard()) {
				this.put(players[turn]);
			} else {
				this.move(players[turn]);
			}
			turn = (turn + 1) % 2;
		} while (!this.existTicTacToe(players[(turn + 1) % 2]));
		System.out.println("Victoria!!!! " + players[(turn + 1) % 2] + "! "
				+ players[(turn + 1) % 2] + "! " + players[(turn + 1) % 2]
				+ "!!!!! Victoria!!!!");
	}

	public void put(char token) {
		System.out.println("Pone el jugador " + token);
		int row;
		int column;
		boolean ok;
		do {
			System.out.println("En qué casilla");
			do {
				row = this.readInt("Fila? [1,3]: ");
			} while (row < 1 || 3 < row);
			do {
				column = this.readInt("Columna? [1,3]: ");
			} while (column < 1 || 3 < column);
			ok = this.squareEmpty(row - 1, column - 1);
			if (!ok) {
				System.out.println("Esa casilla no está vacía");
			}
		} while (!ok);
		this.put(row - 1, column - 1, token);
	}

	public int readInt(String title) {
		int input = 0;
		boolean ok = false;
		do {
			try {
				System.out.print(title);
				input = Integer.parseInt(bufferedReader.readLine());
				ok = true;
			} catch (Exception ex) {
				System.out.println("ERROR DE FORMATO! "
						+ "Introduzca un valor con formato entero.");
			}
		} while (!ok);
		return input;
	}

	public void move(char token) {
		System.out.println("Mueve el jugador " + token);
		int originRow;
		int originColumn;
		int targetRow;
		int targetColumn;
		boolean ok;
		do {
			System.out.println("De qué casilla");
			do {
				originRow = this.readInt("Fila? [1,3]: ");
			} while (originRow < 1 || 3 < originRow);
			do {
				originColumn = this.readInt("Columna? [1,3]: ");
			} while (1 <= originColumn && originColumn <= 3);
			ok = this.squareFull(originRow - 1, originColumn - 1, token);
			if (!ok) {
				System.out.println("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			System.out.println("A qué casilla");
			do {
				targetRow = this.readInt("Fila? [1,3]: ");
			} while (targetRow < 1 || 3 < targetRow);
			do {
				targetColumn = this.readInt("Columna? [1,3]: ");
			} while (targetColumn < 1 || 3 < targetColumn);
			ok = this.squareEmpty(targetRow - 1, targetColumn - 1);
			if (!ok) {
				System.out.println("Esa casilla no está vacía");
			}
		} while (!ok);
		this.put(originRow - 1, originColumn - 1, '_');
		this.put(targetRow - 1, targetColumn - 1, token);
	}

	public void writeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tokens[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean completeBoard() {
		int contTokens = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tokens[i][j] != '_') {
					contTokens++;
				}
			}
		}
		return contTokens == 6;
	}

	public boolean existTicTacToe(char token) {
		if (tokens[1][1] == token) {
			if (tokens[0][0] == token) {
				return tokens[2][2] == token;
			}
			if (tokens[0][2] == token) {
				return tokens[2][0] == token;
			}
			if (tokens[0][1] == token) {
				return tokens[2][1] == token;
			}
			if (tokens[1][0] == token) {
				return tokens[1][2] == token;
			}
			return false;
		}
		if (tokens[0][0] == token) {
			if (tokens[0][1] == token) {
				return tokens[0][2] == token;
			}
			if (tokens[1][0] == token) {
				return tokens[1][2] == token;
			}
			return false;
		}
		if (tokens[2][2] == token) {
			if (tokens[1][2] == token) {
				return tokens[0][2] == token;
			}
			if (tokens[2][1] == token) {
				return tokens[2][0] == token;
			}
			return false;
		}
		return false;
	}

	public boolean squareEmpty(int row, int column) {
		return tokens[row][column] == '_';
	}

	public void put(int row, int column, char token) {
		tokens[row][column] = token;
	}

	public boolean squareFull(int row, int column, char token) {
		return tokens[row][column] == token;
	}

	public static void main(String[] args) {
		new TicTacToe().play();
	}

}
