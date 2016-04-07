package designPatterns.singleton.bad.v1.notObject;

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
