package designPatterns.patterns.flyweight.v1.bad;

public class FlyweightFactory {

	public Flyweight getAFlyweight(){
		return new AFlyweight();
	}
	
	public Flyweight getBFlyweight(){
		return new BFlyweight();
	}
}
