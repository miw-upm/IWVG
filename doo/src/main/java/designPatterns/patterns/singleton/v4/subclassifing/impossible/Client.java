package designPatterns.patterns.singleton.v4.subclassifing.impossible;

public class Client {

	private void exec() {
		//...
		Singleton.instance.m();
		//...
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
