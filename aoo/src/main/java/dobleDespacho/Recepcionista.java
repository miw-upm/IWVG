package dobleDespacho;

public class Recepcionista {

	public void atender(Mujer mujer) {
		mujer.alagar();	
		mujer.piropear();
	}

	public void atender(Hombre hombre) {
		hombre.palmearEspalda(this);
	}

	public void recibirPropina(int euros) {
		System.out.println("Me gané " + euros + " euros");
	}
	
	public void atender(Persona persona) {
		persona.recibir(this);		
	}

}
