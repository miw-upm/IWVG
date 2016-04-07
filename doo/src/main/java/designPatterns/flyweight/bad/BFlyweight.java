package designPatterns.flyweight.bad;

public class BFlyweight extends Flyweight {

	public void m(Context context){
		System.out.println("m de BFlyweight con context: " + this);
	}
}
