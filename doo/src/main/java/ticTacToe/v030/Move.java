package ticTacToe.v030;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Move {

	private char[][] tokens;
	
	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
			System.in));
	
	public Move(char[][] tokens){
		this.tokens = tokens;
	}
	
	public void move(int turn, TTT ticTacToe) {
		System.out.println("Mueve el jugador " + TTT.color[turn]);
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
						originColumn = Integer.parseInt(bufferedReader.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (1 <= originColumn && originColumn <= 3);
			ok = ticTacToe.full(originRow - 1, originColumn - 1, TTT.color[turn]);
			if (!ok) {
				System.out.println("Esa casilla no está ocupada por ninguna de tus fichas");
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
						targetColumn = Integer.parseInt(bufferedReader.readLine());
						ok = true;
					} catch (Exception ex) {
						System.out.println("ERROR DE FORMATO! "
								+ "Introduzca un valor con formato entero.");
					}
				} while (!ok);
			} while (targetColumn < 1 || 3 < targetColumn);
			ok = ticTacToe.empty(targetRow - 1, targetColumn - 1);
			if (!ok) {
				System.out.println("Esa casilla no está vacía");
			}
		} while (!ok);
		tokens[originRow - 1][originColumn - 1] = '_';
		tokens[targetRow - 1][targetColumn - 1] = TTT.color[turn];
	}

}
