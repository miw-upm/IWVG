package designPatterns.flyweight.bad;

public class FlyweightFactory {

	public Flyweight getAFlyweight(){
		return new AFlyweight();
	}
	
	public Flyweight getBFlyweight(){
		return new BFlyweight();
	}
}
