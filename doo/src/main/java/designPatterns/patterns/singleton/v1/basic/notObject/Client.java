package designPatterns.patterns.singleton.v1.basic.notObject;

public class Client {

	private void exec() {
		//...
		Singleton.m();
		//...
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
