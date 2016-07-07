package designPatterns.exercises.n4_poker.builders;

import java.util.HashMap;
import java.util.Map;

import designPatterns.exercises.n4_poker.gambles.GambleType;
import designPatterns.exercises.n4_poker.players.Player;

public class PlayerBuilder {

	private static PlayerBuilder playerBuilder;
	
	public static PlayerBuilder instance() {
		if (playerBuilder == null) {
			playerBuilder = new PlayerBuilder();
		}
		return playerBuilder;
	}
	
	private Map<GambleType, Builder> builderMap;
	
	private PlayerBuilder() {
		builderMap = new HashMap<GambleType, Builder>();
		builderMap.put(GambleType.CARTA_ALTA, new CartaAltaBuilder());
		builderMap.put(GambleType.PAREJA, new ParejaBuilder());
		builderMap.put(GambleType.DOBLE_PAREJA, new DobleParejaBuilder());
		builderMap.put(GambleType.TRIO, new TrioBuilder());
		builderMap.put(GambleType.ESCALERA, new EscaleraBuilder());
		builderMap.put(GambleType.COLOR, new ColorBuilder());
		builderMap.put(GambleType.FULL, new FullBuilder());
		builderMap.put(GambleType.POQUER, new PoquerBuilder());
		builderMap.put(GambleType.ESCALERA_COLOR, new EscaleraColorBuilder());
		builderMap.put(GambleType.ESCALERA_REAL, new EscaleraRealBuilder());
	}
	
	public Player build(GambleType gambleType){
		return builderMap.get(gambleType).build();
	}
	
}
