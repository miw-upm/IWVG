package designPatterns.singleton.v3.multipleInstances;

public class Application {

	private void exec() {
		//...
		for(int i=0; i<10; i++){
			Singleton.instance().m();
		}
		//...
	}
	
	public static void main(String[] args){
		new Application().exec();
	}

}
