package designPatterns.singleton.v1.basic.notObject;

public class Application {

	private void exec() {
		//...
		Singleton.m();
		//...
	}
	
	public static void main(String[] args){
		new Application().exec();
	}

}
