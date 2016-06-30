package desingPatterns.exercises.n1.io.v3.singleton;

public class Application {

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
		new Application().exec();
	}
}
