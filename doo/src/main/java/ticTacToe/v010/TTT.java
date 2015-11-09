package ticTacToe.v010;

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

// Modificada por Luis en noviembre de 2015
public class TTT {
	// atributos /////////////////////////////////////////////
	private char[][] box; // 3x3 casillas
	public static char[] color = { 'x', 'o' }; // colores de los jugadores
	private int zeroOrOne; // turno
//	private boolean ticTacToe;
	private Start s; // arrancar
	private Put p; // poner
	private Move m; // mover
	public TTT() { // inicializo atributos
	zeroOrOne = 0;
//	ticTacToe = false;
	box = new char[3][3]; s = new Start(box); p = new Put(box);
	}
	// métodos /////////////////////////////////////////////
	public void exec() {
	do {
	s.write();
	// mientras no esté completo el tablero, pone; luego mueve
	if (!this.complete()) {
	p.put(zeroOrOne, this);} else {
	m.move(zeroOrOne, this);}
	zeroOrOne = (zeroOrOne + 1) % 2;
	} while (!this.existTTT());
	// no arranca, solo para escribir el tablero
	s.write();this.message(zeroOrOne);
	}

	public boolean complete() {
	int c = 0;
	for (int contRow = 0; contRow < 3; contRow++) {
	for (int contColumn = 0; contColumn < 3; contColumn++) {
	if (box[contRow][contColumn]!='_') {c++;}}}
	return c == 6;}

	public boolean existTTT() {
	return this.existTTT('x')|| this.existTTT('o');}

	public boolean existTTT(char token) {
	// si está en el centro
	if (box[1][1]==token) {
	// si está arriba izquierda
	if (box[0][0]==token) {
	// si está abajo derecha
	return box[2][2]==token;
	}
	// si está arriba derecha
	if (box[0][2]==token) {
	// si está abajo izquirda
	return box[2][0]==token;
	}
	if (box[0][1]==token) {
	return box[2][1]==token;
	}
	if (box[1][0]==token) {
	return box[1][2]==token;
	}
	return false;
	}
	if (box[0][0]==token) {
	if (box[0][1]==token) {
	return box[0][2]==token;
	}
	if (box[1][0]==token) {
	return box[2][0]==token;
	}
	return false;
	}
	if (box[2][2]==token) {
	if (box[1][2]==token) {
	return box[0][2]==token;
	}
	if (box[2][1]==token) {
	return box[2][0]==token;
	}
	return false;
	}
	return false;
	}

	public boolean empty(int r, int c) {
	return box[r][c]=='_';}

	//si una casilla está llena de una ficha
	public boolean full(int r, int c, char t) {
	return box[r][c]==t;}

	public void clear() {
	for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
	box[i][j] = '_';}}}

	public void message(int turn) {// porque se cambió en turno
	turn = (turn + 1) % 2;
	System.out.println("Victoria!!!! " + TTT.color[turn] + "! "+ TTT.color[turn] + "! " + TTT.color[turn]+ "! Victoria!!!!");}

	public static void main(String[] args) {
	new TTT().exec();}}
