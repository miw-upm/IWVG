package designPatterns.patterns.flyweight.v2.basic;

public class BFlyweight extends Flyweight {

	public void m(Context context){
		System.out.println("m de BFlyweight con context: " + this);
	}
}
