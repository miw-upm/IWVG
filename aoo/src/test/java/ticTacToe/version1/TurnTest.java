package ticTacToe.version1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ticTacToe.version1.Turn;

public class TurnTest {

	private Turn turn;
	
	@Before
	public void init(){
		turn = new Turn();
	}
	
	@Test
	public void testTake() {
		assertEquals(0, turn.take());
		turn.change();
		assertEquals(1, turn.take());
		turn.change();
		assertEquals(0, turn.take());
	}
	
	@Test
	public void testNotTake() {
		assertEquals(1, turn.notTake());
		turn.change();
		assertEquals(0, turn.notTake());
		turn.change();
		assertEquals(1, turn.notTake());
	}

}
