package ticTacToe.v040;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Put {

	private char[][] tokens;
	
	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
			System.in));
	
	public Put(char[][] tokens){
		this.tokens = tokens;
	}
	
	public void put(int turn, TicTacToe ticTacToe) {
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
			ok = ticTacToe.empty(row - 1, column - 1);
			if (!ok) {
				System.out.println("Esa casilla no está vacía");
			}
		} while (!ok);
		tokens[row - 1][column - 1] = TicTacToe.COLOR[turn];
	}
}
