package designPatterns.patterns.flyweight.v2.basic;

public class FlyweightFactory {

	private AFlyweight aFlyweight;
	
	private BFlyweight bFlyweight;
	
	public Flyweight getAFlyweight(){
		if (aFlyweight == null) {
			aFlyweight = new AFlyweight();
		}
		return aFlyweight;
	}
	
	public Flyweight getBFlyweight(){
		if (bFlyweight == null) {
			bFlyweight = new BFlyweight();
		}
		return bFlyweight;
	}
}
