package designPatterns.patterns.flyweight.v2.basic;

public class Client {

	private void exec() {
		//...
		Context context = new Context();
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		flyweightFactory.getAFlyweight().m(context);
		flyweightFactory.getBFlyweight().m(context);
		flyweightFactory.getAFlyweight().m(context);
		flyweightFactory.getBFlyweight().m(context);
		flyweightFactory.getAFlyweight().m(context);
		flyweightFactory.getBFlyweight().m(context);
		flyweightFactory.getAFlyweight().m(context);
		flyweightFactory.getBFlyweight().m(context);
	}
	
	public static void main(String[] args){
		new Client().exec();
	}
}
