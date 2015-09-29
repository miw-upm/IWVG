package ticTacToe.version1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ticTacToe.version1.Board;

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
				board.empty(i, j);
			}
		}
	}

	@Test
	public void testComplete() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				board.put(i, j, new Token('x'));
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
		assertTrue(board.empty(0, 0));
		board.put(0, 0, new Token('x'));
		assertFalse(board.empty(0, 0));
		board.put(0, 0, new Token('_'));
		assertTrue(board.empty(0, 0));
	}

	@Test
	public void testFull() {
		assertFalse(board.full(1, 2, new Token('o')));
		board.put(1, 2, new Token('o'));
		assertTrue(board.full(1, 2, new Token('o')));
		board.put(1, 2, new Token('_'));
		assertFalse(board.full(1, 2, new Token('o')));
	}

	@Test
	public void testPut() {
		board.put(0, 1, new Token('x'));
		assertTrue(board.full(0, 1, new Token('x')));
		board.put(0, 1, new Token('o'));
		assertFalse(board.full(0, 1, new Token('_')));
	}
	
	@Test
	public void testExistTicTacToe() {
		board.put(0, 0, new Token('x'));
		board.put(0, 1, new Token('x'));
		board.put(0, 2, new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
		board = new Board();
		board.put(0, 1, new Token('x'));
		board.put(1, 1, new Token('x'));
		board.put(2, 1, new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
		board = new Board();
		board.put(0, 0, new Token('x'));
		board.put(1, 1, new Token('x'));
		board.put(2, 2, new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
		board = new Board();
		board.put(0, 2, new Token('x'));
		board.put(1, 1, new Token('x'));
		board.put(2, 0, new Token('x'));
		assertTrue(board.existTicTacToe(new Token('x')));
	}

}
