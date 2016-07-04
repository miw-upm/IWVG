package designPatterns.exercises.n1_io.v1_bad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public void exec(){
		// ...
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
				System.in));
		// ...
		int code = 0;
		boolean ok = false;
		do {
			try {
				System.out.print("Introduzca el código: ");
				String input = bufferedReader.readLine();
				code = Integer.parseInt(input);
				ok = true;
			} catch (IOException ex) {
				System.out.println("Error de formato entero");
			}
		} while (!ok);
		
		// ...
		
		int amount = 0;
		ok = false;
		do {
			try {
				System.out.print("Introduzca la cantidad: ");
				String input = bufferedReader.readLine();
				amount = Integer.parseInt(input);
				ok = true;
			} catch (IOException ex) {
				System.out.println("Error de formato entero");
			}
		} while (!ok);
		//...
		System.out.println("Código: " + code);
		System.out.println("Cantidad: " + amount);
		
	}
	
	public static void main(String[] args) {
		new Client().exec();
	}
}
