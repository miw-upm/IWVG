package ticTacToe.v470.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ticTacToe.v470.utils.Direction;

class Board extends Subject {

	private Map<Color, Set<Coordinate>> coordinates;
	
	private boolean existTicTacToe;

	Board(int numPlayers) {
		assert numPlayers > 0;
		coordinates = new HashMap<>();
		for (int i = 0; i < numPlayers; i++) {
			coordinates.put(Color.values()[i], new HashSet<>());
		}
		existTicTacToe = false;
	}

	Color getColor(Coordinate coordinate) {
		assert coordinate != null;
		for (Color color : coordinates.keySet()) {
			if (coordinates.get(color).contains(coordinate)) {
				return color;
			}
		}
		return Color.NONE;
	}

	boolean complete() {
		int contTokens = 0;
		for (Color color : coordinates.keySet()) {
			contTokens += coordinates.get(color).size();
		}
		return contTokens == Coordinate.DIMENSION
				* coordinates.keySet().size();
	}

	boolean existTicTacToe() {
		return existTicTacToe;
	}
	
	private boolean existTicTacToe(Color color) {
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

	boolean empty(Coordinate coordinate) {
		assert coordinate != null;
		return !this.full(coordinate, Color.XS)
				&& !this.full(coordinate, Color.OS);
	}

	void put(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		assert color != null;
		coordinates.get(color).add(coordinate.clone());
		existTicTacToe = this.existTicTacToe(color);
		if (existTicTacToe) {
			this.end();
		}
	}

	void remove(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		coordinates.get(color).remove(coordinate);
	}

	boolean full(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		return coordinates.get(color).contains(coordinate);
	}

	void clear() {
		for (Color color : coordinates.keySet()) {
			coordinates.get(color).clear();
		}
		existTicTacToe = false;
	}
	
	public List<Coordinate> emptyCoordinates() {
		List<Coordinate> emptyCoordinates = new ArrayList<Coordinate>(); 
		for(int i=0; i< Coordinate.DIMENSION; i++){
			for(int j=0; j<Coordinate.DIMENSION; j++){
				Coordinate coordinate = new Coordinate(i,j);
				if (this.getColor(coordinate)== Color.NONE){
					emptyCoordinates.add(coordinate);
				}
			}
		}
		return emptyCoordinates;
	}
	
	public List<Coordinate> playerCoordinates(Color color) {
		List<Coordinate> playerCoordinates = new ArrayList<Coordinate>(); 
		for(int i=0; i< Coordinate.DIMENSION; i++){
			for(int j=0; j<Coordinate.DIMENSION; j++){
				Coordinate coordinate = new Coordinate(i,j);
				if (this.getColor(coordinate)== color){
					playerCoordinates.add(coordinate);
				}
			}
		}
		return playerCoordinates;
	}

}
