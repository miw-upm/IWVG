package dobleDespacho;

import java.util.Random;

public class BuenHotel {

	public static void main(String[] args) {
		BuenHotel buenHotel = new BuenHotel();
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < 5; i++) {
			Persona persona;
			if (random.nextInt(2) == 0) {
				persona = new Hombre();
			} else {
				persona = new Mujer();
			}
			buenHotel.escenario(persona);
		}
	}
	
	public void escenario(Persona persona) {
		Recepcionista recepcionista = new Recepcionista();
		recepcionista.atender(persona);
	}
}
