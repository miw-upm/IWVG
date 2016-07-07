package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.gambles.GambleType;
import designPatterns.exercises.n4_poker.players.Player;

public class Poquer {

	private void play() {
		Player[] players = new Player[20];
		for (int i = 0; i < 10; i++) {
			players[i] = PlayerBuilder.instance().build(GambleType.values()[i]);
		}
		for (int i = 0; i < 10; i++) {
			players[i + 10] = PlayerBuilder.instance().build(
					GambleType.values()[i]);
		}
		for (int i = 0; i < players.length; i++) {
			System.out.println("===========================");
			players[i].show();
			for (int j = i; j < players.length; j++) {
				Player winner = players[i].whoIsWinner(players[j]);
				System.out.println("-------------------");
				System.out.println(players[i]);
				System.out.println(players[j]);
				if (winner == null) {
					System.out.println("EMPATE!!!");
				} else {
					System.out.println("GANADOR: " + winner);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Poquer().play();
	}
}
