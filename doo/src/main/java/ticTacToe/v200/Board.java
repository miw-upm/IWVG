package ticTacToe.v200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Board {

	private Map<Integer, Set<TicTacToeCoordinate>> coordinates;

	public Board(int numPlayers) {
		coordinates = new HashMap<>();
		for (int i = 0; i < numPlayers; i++) {
			coordinates.put(i, new HashSet<>());
		}
	}

	public void write() {
		IO io = new IO();
		for (int i = 0; i < TicTacToeCoordinate.DIMENSION; i++) {
			for (int j = 0; j < TicTacToeCoordinate.DIMENSION; j++) {
				io.write(this.getColor(new TicTacToeCoordinate(i, j)) + " ");
			}
			io.writeln();
		}
	}

	private Color getColor(TicTacToeCoordinate coordinate) {
		assert coordinate != null;
		for(Integer player : coordinates.keySet()){
			if (coordinates.get(player).contains(coordinate)) {
				return Color.values()[player];
			}
		}
		return Color.NONE;
	}

	public boolean complete() {
		int contTokens = 0;
		for(Integer player : coordinates.keySet()){
			contTokens += coordinates.get(player).size();
		}
		return contTokens == TicTacToeCoordinate.DIMENSION * coordinates.keySet().size();
	}

	public boolean existTicTacToe() {
		return this.existTicTacToe(Color.XS) || this.existTicTacToe(Color.OS);
	}

	public boolean existTicTacToe(Color color) {
		assert color != Color.NONE;
		Set<TicTacToeCoordinate> coordinateSet = coordinates.get(color.ordinal());
		if (coordinateSet.size() != TicTacToeCoordinate.DIMENSION) {
			return false;
		}
		TicTacToeCoordinate[] coordinateArray = coordinateSet.toArray(new TicTacToeCoordinate[0]);
		Direction direction = coordinateArray[0].direction(coordinateArray[1]);
		if (direction == Direction.NON_EXISTENT) {
			return false;
		}
		for (int i = 1; i < TicTacToeCoordinate.DIMENSION - 1; i++) {
			if (coordinateArray[i].direction(coordinateArray[i + 1]) != direction) {
				return false;
			}
		}
		return true;
	}

	public boolean empty(TicTacToeCoordinate coordinate) {
		assert coordinate != null;
		return !this.full(coordinate, Color.XS) && !this.full(coordinate, Color.OS);
	}

	public void put(TicTacToeCoordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		assert color != null;
		coordinates.get(color.ordinal()).add(coordinate);
	}

	public void remove(TicTacToeCoordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		coordinates.get(color.ordinal()).remove(coordinate);
	}

	public boolean full(TicTacToeCoordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		return coordinates.get(color.ordinal()).contains(coordinate);
	}

}
