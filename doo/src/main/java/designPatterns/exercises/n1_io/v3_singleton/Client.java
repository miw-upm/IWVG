package designPatterns.exercises.n1_io.v3_singleton;

public class Client {

	public void exec(){
		// ...
		
		int code = IO.instance().readInt("Introduzca el código: ");
		// ...
		int amount = IO.instance().readInt("Introduzca la cantidad: ");
		//...
		IO.instance().writeln("Código: " + code);
		IO.instance().writeln("Cantidad: " + amount);
		
	}
	
	public static void main(String[] args) {
		new Client().exec();
	}
}
