package dobleDespacho;

import java.util.Random;

public class MalHotel {
	
	public static void main(String[] args){
		MalHotel malHotel = new MalHotel();
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < 5; i++) {
			Persona persona;
			if (random.nextInt(2) == 0) {
				persona = new Hombre();
			} else {
				persona = new Mujer();
			}
			malHotel.escenario(persona);
		}
	}
	
	public void escenario(Persona persona) {
		Recepcionista recepcionista = new Recepcionista();
		if (persona instanceof Mujer) {
			((Mujer) persona).alagar();	
			((Mujer) persona).piropear();	
		} else {
			((Hombre) persona).palmearEspalda(recepcionista);
		}
	}
}
