package desingPatterns.exercises.n1.io.v2.facade;

public class Client {

	public void exec(){
		// ...
		IO io = new IO();
		// ...
		int code = io.readInt("Introduzca el código: ");
		// ...
		int amount = io.readInt("Introduzca la cantidad: ");
		//...
		io.writeln("Código: " + code);
		io.writeln("Cantidad: " + amount);
		
	}
	
	public static void main(String[] args) {
		new Client().exec();
	}
}
