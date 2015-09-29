package ticTacToe.version2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ticTacToe.version2.Board;
import ticTacToe.version2.Coordinate;

public class BoardTest {

	private Board board;

	@Before
	public void init() {
		board = new Board();
	}

	@Test
	public void testBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board.empty(new Coordinate(i, j));
			}
		}
	}

	@Test
	public void testComplete() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				board.put(new Coordinate(i, j), new Token('x'));
				if (i == 1 && j == 2) {
					assertTrue(board.complete());
				} else {
					assertFalse(board.complete());
				}
			}
		}
	}

	@Test
	public void testEmpty() {
		assertTrue(board.empty(new Coordinate(0, 0)));
		board.put(new Coordinate(0, 0), new Token('x'));
		assertFalse(board.empty(new Coordinate(0, 0)));
		board.put(new Coordinate(0, 0), new Token('_'));
		assertTrue(board.empty(new Coordinate(0, 0)));
	}

	@Test
	public void testFull() {
		assertFalse(board.full(new Coordinate(1, 2), new Token('o')));
		board.put(new Coordinate(1, 2), new Token('o'));
		assertTrue(board.full(new Coordinate(1, 2), new Token('o')));
		board.put(new Coordinate(1, 2), new Token('o'));
		assertFalse(board.full(new Coordinate(1, 2), new Token('o')));
	}

	@Test
	public void testPut() {
		board.put(new Coordinate(0, 1), new Token('x'));
		assertTrue(board.full(new Coordinate(0, 1), new Token('x')));
		board.put(new Coordinate(0, 1), new Token('o'));
		assertFalse(board.full(new Coordinate(0, 1), new Token('_')));
	}
	
	@Test
	public void testExistTicTacToe() {
		board.put(new Coordinate(0, 0), new Token('x'));
		board.put(new Coordinate(0, 1), new Token('x'));
		board.put(new Coordinate(0, 2), new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
		board = new Board();
		board.put(new Coordinate(0, 1), new Token('x'));
		board.put(new Coordinate(1, 1), new Token('x'));
		board.put(new Coordinate(2, 1), new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
		board = new Board();
		board.put(new Coordinate(0, 0), new Token('x'));
		board.put(new Coordinate(1, 1), new Token('x'));
		board.put(new Coordinate(2, 2), new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
		board = new Board();
		board.put(new Coordinate(0, 2), new Token('x'));
		board.put(new Coordinate(1, 1), new Token('x'));
		board.put(new Coordinate(2, 0), new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
	}

}
