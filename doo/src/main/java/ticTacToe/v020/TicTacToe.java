package ticTacToe.v020;

/**
 *  Ejempo de historieta que no pinta nada aquí
 *  
 *  The <tt>Digraph</tt> class represents a directed graph of vertices
 *  named 0 through <em>V</em> - 1.
 *  It supports the following two primary operations: add an edge to the digraph,
 *  iterate over all of the vertices adjacent from a given vertex.
 *  Parallel edges and self-loops are permitted.
 *  <p>
 *  This implementation uses an adjacency-lists representation, which 
 *  is a vertex-indexed array of {@link Bag} objects.
 *  All operations take constant time (in the worst case) except
 *  iterating over the vertices adjacent from a given vertex, which takes
 *  time proportional to the number of such vertices.
 *  <p>
 *  For additional documentation,
 *  see <a href="http://algs4.cs.princeton.edu/42digraph">Section 4.2</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 */

public class TicTacToe {

	// atributos /////////////////////////////////////////////////////
	
	// se podría guardar las coordenadas de las fichas
	// pero con 3x3 caracteres parece más eficiente
	private char[][] tokens; // array bidimensional para los tokens

	public static char[] COLOR = { 'x', 'o' }; // caracteres para el color de la fichas
	
	private int turn; // turno de 0 a 1
	
	private Start start; // para arrancar
	
	private Put put; // para poner
	
	private Move move; // para mover

	// constructores /////////////////////////////////////////////////////
	
	public TicTacToe() {
		turn = 0;
		// creación de la operaciones
		tokens = new char[3][3];
		start = new Start(tokens);
		put = new Put(tokens);
	}

	// métodos /////////////////////////////////////////////////////
	
	public void play() {
		// el juego se desarrolla por turno de jugadores
		// que ponen o mueven según esté el tablero lleno
		// hasta que se consiga las tres en raya
		do {
			start.write();
			if (!this.complete()) {
				put.put(turn, this);
			} else {
				move.move(turn, this);
			}
			turn = (turn + 1) % 2;
			// posible optimización si se pasa el caracter del jugador que acaba de poner
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
		// posible optimización si se pasa el caracter del jugador que acaba de poner
		return this.existTicTacToe('x')
				|| this.existTicTacToe('o');
	}

	public boolean existTicTacToe(char token) {
		// si está en el centro
		if (tokens[1][1]==token) {
			// si está arriba izquierda
			if (tokens[0][0]==token) {
				// si está abajo derecha
				// diagonal principal
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

	// siempre da true mientras no está la casilla vacía
	public boolean full(int row, int column, char token) {
		return tokens[row][column]==token;
	}

	// AVISO: esta función hay que depurarla
//	public void clear() {
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				tokens[i][j] = '_';
//			}
//		}
//	}

	public void win(int turn) {
		System.out.println("Victoria!!!! " + TicTacToe.COLOR[turn] + "! "
				+ TicTacToe.COLOR[turn] + "! " + TicTacToe.COLOR[turn]
				+ "! Victoria!!!!");
	}
	
	// main /////////////////////////////////////////////////////
	

	public static void main(String[] args) {
		new TicTacToe().play();
	}
}
