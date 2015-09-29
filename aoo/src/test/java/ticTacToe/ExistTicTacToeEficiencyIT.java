package ticTacToe;

import org.junit.Test;

import ticTacToe.version2.Token;

public class ExistTicTacToeEficiencyIT {

	private ticTacToe.version2.Board version2Board = new ticTacToe.version2.Board();
	private ticTacToe.version3.Board version3Board = new ticTacToe.version3.Board();
	private ticTacToe.version4.Board version4Board = new ticTacToe.version4.Board();

	private float testVersion2ExistTicTacToeEficiency() {
		float timeAcum = 0;
		version2Board = new ticTacToe.version2.Board();
		version2Board.put(new ticTacToe.version2.Coordinate(0, 0), new Token('x'));
		timeAcum += this.version2ExistTicTacToeTime();
		version2Board.put(new ticTacToe.version2.Coordinate(0, 1), new Token('x'));
		timeAcum += this.version2ExistTicTacToeTime();
		version2Board.put(new ticTacToe.version2.Coordinate(0, 2), new Token('x'));
		timeAcum += this.version2ExistTicTacToeTime();
		version2Board.put(new ticTacToe.version2.Coordinate(0, 2), new Token('_'));
		version2Board.put(new ticTacToe.version2.Coordinate(1, 2), new Token('x'));
		timeAcum += this.version2ExistTicTacToeTime();
		return timeAcum;

	}

	private float version2ExistTicTacToeTime() {
		long startTime;
		long endTime;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			version2Board.existTicTacToe();
		}
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	private float testVersion3ExistTicTacToeEficiency() {
		float timeAcum = 0;
		version3Board = new ticTacToe.version3.Board();
		version3Board.put(new ticTacToe.version3.Coordinate(0, 0), new Token('x'));
		timeAcum += this.version3ExistTicTacToeTime();
		version3Board.put(new ticTacToe.version3.Coordinate(0, 1), new Token('x'));
		timeAcum += this.version3ExistTicTacToeTime();
		version3Board.put(new ticTacToe.version3.Coordinate(0, 2), new Token('x'));
		timeAcum += this.version3ExistTicTacToeTime();
		version3Board.put(new ticTacToe.version3.Coordinate(0, 2), new Token('_'));
		version3Board.put(new ticTacToe.version3.Coordinate(1, 2), new Token('x'));
		timeAcum += this.version3ExistTicTacToeTime();
		return timeAcum;

	}

	private float version3ExistTicTacToeTime() {
		long startTime;
		long endTime;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			version3Board.existTicTacToe();
		}
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	private float testVersion4ExistTicTacToeEficiency() {
		float timeAcum = 0;
		version4Board = new ticTacToe.version4.Board();
		version4Board.put(new ticTacToe.version4.Coordinate(0, 0), new Token('x'));
		timeAcum += this.version4ExistTicTacToeTime();
		version4Board.put(new ticTacToe.version4.Coordinate(0, 1), new Token('x'));
		timeAcum += this.version4ExistTicTacToeTime();
		version4Board.put(new ticTacToe.version4.Coordinate(0, 2), new Token('x'));
		timeAcum += this.version4ExistTicTacToeTime();
		version4Board.put(new ticTacToe.version4.Coordinate(0, 2), new Token('_'));
		version4Board.put(new ticTacToe.version4.Coordinate(1, 2), new Token('x'));
		timeAcum += this.version4ExistTicTacToeTime();
		return timeAcum;

	}

	private float version4ExistTicTacToeTime() {
		long startTime;
		long endTime;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			version4Board.existTicTacToe();
		}
		endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	@Test
	public void testExistTicTacToeEficiency() {
		System.out.println("Version 2: "
				+ this.testVersion2ExistTicTacToeEficiency());
		System.out.println("Version 3: "
				+ this.testVersion3ExistTicTacToeEficiency());
		System.out.println("Version 4: "
				+ this.testVersion4ExistTicTacToeEficiency());
		System.out.println("Version 2: "
				+ this.testVersion2ExistTicTacToeEficiency()/40000);
		System.out.println("Version 3: "
				+ this.testVersion3ExistTicTacToeEficiency()/40000);
		System.out.println("Version 4: "
				+ this.testVersion4ExistTicTacToeEficiency()/40000);
	}

}
