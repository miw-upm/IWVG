package designPatterns.patterns.flyweight.v1.bad;

public class AFlyweight extends Flyweight {

	public void m(Context context){
		System.out.println("m de AFlyweight con context: " + this);
	}
}
