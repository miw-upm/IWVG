package ticTacToe.v050;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TicTacToe {

	private char[][] tokens;

	private static char[] COLOR = { 'x', 'o' };

	private int turn;

	private BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(System.in));

	public TicTacToe() {
		turn = 0;
		tokens = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tokens[i][j] = '_';
			}
		}
	}

	public void play() {
		do {
			this.write();
			if (!this.complete()) {
				this.put(turn);
			} else {
				this.move(turn);
			}
			turn = (turn + 1) % 2;
		} while (!this.existTicTacToe());
		this.write();
		this.win(turn);
	}

	public void write() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tokens[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean complete() {
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

	public boolean existTicTacToe() {
		return this.existTicTacToe('x') || this.existTicTacToe('o');
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
				return tokens[2][0] == token;
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

	public boolean empty(int row, int column) {
		return tokens[row][column] == '_';
	}

	public void put(int turn) {
		System.out.println("Pone el jugador " + TicTacToe.COLOR[turn]);
		int row = 0;
		int column = 0;
		boolean ok;
		do {
			System.out.println("En qué casilla?");
			do {
				ok = false;
				do {
					try {
						System.out.println("Fila? [1,3]: ");
						row = Integer.parseInt(bufferedReader.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (row < 1 || 3 < row);
			do {
				ok = false;
				do {
					try {
						System.out.println("Columna? [1,3]: ");
						column = Integer.parseInt(bufferedReader.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (column < 1 || 3 < column);
			ok = this.empty(row - 1, column - 1);
			if (!ok) {
				System.out.println("Esa casilla no está vacía");
			}
		} while (!ok);
		tokens[row - 1][column - 1] = TicTacToe.COLOR[turn];
	}

	public void move(int turn) {
		System.out.println("Mueve el jugador " + TicTacToe.COLOR[turn]);
		int originRow = 0;
		int originColumn = 0;
		int targetRow = 0;
		int targetColumn = 0;
		boolean ok;
		do {
			System.out.println("De qué casilla?");
			do {
				ok = false;
				do {
					try {
						System.out.println("Fila? [1,3]: ");
						originRow = Integer.parseInt(bufferedReader.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (originRow < 1 || 3 < originRow);
			do {
				ok = false;
				do {
					try {
						System.out.println("Columna? [1,3]: ");
						originColumn = Integer.parseInt(bufferedReader
								.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (1 <= originColumn && originColumn <= 3);
			ok = this.full(originRow - 1, originColumn - 1,
					TicTacToe.COLOR[turn]);
			if (!ok) {
				System.out
						.println("Esa casilla no está ocupada por ninguna de tus fichas");
			}
		} while (!ok);
		do {
			System.out.println("A qué casilla?");
			do {
				ok = false;
				do {
					try {
						System.out.println("Fila? [1,3]: ");
						targetRow = Integer.parseInt(bufferedReader.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (targetRow < 1 || 3 < targetRow);
			do {
				ok = false;
				do {
					try {
						System.out.println("Columna? [1,3]: ");
						targetColumn = Integer.parseInt(bufferedReader
								.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (targetColumn < 1 || 3 < targetColumn);
			ok = this.empty(targetRow - 1, targetColumn - 1);
			if (!ok) {
				System.out.println("Esa casilla no está vacía");
			}
		} while (!ok);
		tokens[originRow - 1][originColumn - 1] = '_';
		tokens[targetRow - 1][targetColumn - 1] = TicTacToe.COLOR[turn];
	}

	public boolean full(int row, int column, char token) {
		return tokens[row][column] == token;
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
