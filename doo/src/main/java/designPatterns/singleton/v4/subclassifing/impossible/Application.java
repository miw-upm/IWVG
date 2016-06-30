package designPatterns.singleton.v4.subclassifing.impossible;

public class Application {

	private void exec() {
		//...
		Singleton.instance.m();
		//...
	}
	
	public static void main(String[] args){
		new Application().exec();
	}

}
