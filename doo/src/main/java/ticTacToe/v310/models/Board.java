package ticTacToe.v310.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ticTacToe.v310.utils.Direction;
import ticTacToe.v310.utils.IO;

public class Board {

	private Map<Color, Set<Coordinate>> coordinates;

	public Board(int numPlayers) {
		assert numPlayers > 0;
		coordinates = new HashMap<>();
		for (int i = 0; i < numPlayers; i++) {
			coordinates.put(Color.values()[i], new HashSet<>());
		}
	}

	public void write() {
		IO io = new IO();
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				io.write(this.getColor(new Coordinate(i, j)) + " ");
			}
			io.writeln();
		}
	}

	private Color getColor(Coordinate coordinate) {
		assert coordinate != null;
		for (Color color : coordinates.keySet()) {
			if (coordinates.get(color).contains(coordinate)) {
				return color;
			}
		}
		return Color.NONE;
	}

	public boolean complete() {
		int contTokens = 0;
		for (Color color : coordinates.keySet()) {
			contTokens += coordinates.get(color).size();
		}
		return contTokens == Coordinate.DIMENSION
				* coordinates.keySet().size();
	}

	public boolean existTicTacToe(Color color) {
		assert color != Color.NONE;
		Set<Coordinate> coordinateSet = coordinates.get(color);
		if (coordinateSet.size() != Coordinate.DIMENSION) {
			return false;
		}
		Coordinate[] coordinateArray = coordinateSet
				.toArray(new Coordinate[0]);
		Direction direction = coordinateArray[0].direction(coordinateArray[1]);
		if (direction == Direction.NON_EXISTENT) {
			return false;
		}
		for (int i = 1; i < Coordinate.DIMENSION - 1; i++) {
			if (coordinateArray[i].direction(coordinateArray[i + 1]) != direction) {
				return false;
			}
		}
		return true;
	}

	public boolean empty(Coordinate coordinate) {
		assert coordinate != null;
		return !this.full(coordinate, Color.XS)
				&& !this.full(coordinate, Color.OS);
	}

	public void put(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		assert color != null;
		coordinates.get(color).add(coordinate.clone());
	}

	public void remove(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		coordinates.get(color).remove(coordinate);
	}

	public boolean full(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		return coordinates.get(color).contains(coordinate);
	}

	public void clear() {
		for (Color color : coordinates.keySet()) {
			coordinates.get(color).clear();
		}		
	}

}
