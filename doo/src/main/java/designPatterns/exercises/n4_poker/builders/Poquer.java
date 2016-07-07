package designPatterns.exercises.n4_poker.builders;

import designPatterns.exercises.n4_poker.gambles.GambleType;
import designPatterns.exercises.n4_poker.players.Player;

public class Poquer {

	private void play() {
		Player[] players = new Player[20];
		players[0] = PlayerBuilder.instance().build(GambleType.CARTA_ALTA);
		players[1] = PlayerBuilder.instance().build(GambleType.PAREJA);
		players[2] = PlayerBuilder.instance().build(GambleType.DOBLE_PAREJA);
		players[3] = PlayerBuilder.instance().build(GambleType.TRIO);
		players[4] = PlayerBuilder.instance().build(GambleType.ESCALERA);
		players[5] = PlayerBuilder.instance().build(GambleType.COLOR);
		players[6] = PlayerBuilder.instance().build(GambleType.FULL);
		players[7] = PlayerBuilder.instance().build(GambleType.POQUER);
		players[8] = PlayerBuilder.instance().build(GambleType.ESCALERA_COLOR);
		players[9] = PlayerBuilder.instance().build(GambleType.ESCALERA_REAL);
		players[10] = PlayerBuilder.instance().build(GambleType.CARTA_ALTA);
		players[11] = PlayerBuilder.instance().build(GambleType.PAREJA);
		players[12] = PlayerBuilder.instance().build(GambleType.DOBLE_PAREJA);
		players[13] = PlayerBuilder.instance().build(GambleType.TRIO);
		players[14] = PlayerBuilder.instance().build(GambleType.ESCALERA);
		players[15] = PlayerBuilder.instance().build(GambleType.COLOR);
		players[16] = PlayerBuilder.instance().build(GambleType.FULL);
		players[17] = PlayerBuilder.instance().build(GambleType.POQUER);
		players[18] = PlayerBuilder.instance().build(GambleType.ESCALERA_COLOR);
		players[19] = PlayerBuilder.instance().build(GambleType.ESCALERA_REAL);
		for(int i=0; i<players.length; i++){
			System.out.println("===========================");
			players[i].show();
			for(int j=i; j<players.length; j++){
				Player winner = players[i].whoIsWinner(players[j]);
				System.out.println("-------------------");
				System.out.println(players[i]);
				System.out.println(players[j]);
				if (winner == null){
					System.out.println("EMPATE!!!");
				} else {
					System.out.println("GANADOR: " + winner);
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Poquer().play();
	}
}
