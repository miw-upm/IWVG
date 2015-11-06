package dobleDespacho.bien.extensible;

import java.util.Random;

public class Restaurante {

	private Recepcionista recepcionista;
	
	private Camarero camarero;
	
	private Restaurante(){
		recepcionista = new Recepcionista();
		camarero = new Camarero();
	}
	
	public static void main(String[] args) {
		new Restaurante().simularEscenario();
	}

	private void simularEscenario() {
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < 5; i++) {
			Persona persona;
			if (random.nextInt(2) == 0) {
				persona = new Hombre();
			} else {
				persona = new Mujer();
			}
			this.simularEscenario(persona);
		}
	}
	
	private void simularEscenario(Persona persona) {
		persona.saludar();
		recepcionista.recibir(persona);
		persona.pedir();
		camarero.servir(persona);
		persona.despedirse();
		camarero.recoger();
		recepcionista.agradecerVisita();
		System.out.println("... ");
		System.out.println("... pasa el tiempo!");
		System.out.println("... ");
	}

}
